// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRoutineCodeRevisionRequest} extends {@link RequestModel}
 *
 * <p>DeleteRoutineCodeRevisionRequest</p>
 */
public class DeleteRoutineCodeRevisionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SelectCodeRevision")
    @com.aliyun.core.annotation.Validation(required = true)
    private String selectCodeRevision;

    private DeleteRoutineCodeRevisionRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.selectCodeRevision = builder.selectCodeRevision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRoutineCodeRevisionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return selectCodeRevision
     */
    public String getSelectCodeRevision() {
        return this.selectCodeRevision;
    }

    public static final class Builder extends Request.Builder<DeleteRoutineCodeRevisionRequest, Builder> {
        private String name; 
        private String selectCodeRevision; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRoutineCodeRevisionRequest request) {
            super(request);
            this.name = request.name;
            this.selectCodeRevision = request.selectCodeRevision;
        } 

        /**
         * The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The number of the version that you want to delete.
         */
        public Builder selectCodeRevision(String selectCodeRevision) {
            this.putBodyParameter("SelectCodeRevision", selectCodeRevision);
            this.selectCodeRevision = selectCodeRevision;
            return this;
        }

        @Override
        public DeleteRoutineCodeRevisionRequest build() {
            return new DeleteRoutineCodeRevisionRequest(this);
        } 

    } 

}
