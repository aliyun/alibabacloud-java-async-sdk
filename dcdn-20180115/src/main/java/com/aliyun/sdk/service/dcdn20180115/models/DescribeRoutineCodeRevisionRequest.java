// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoutineCodeRevisionRequest} extends {@link RequestModel}
 *
 * <p>DescribeRoutineCodeRevisionRequest</p>
 */
public class DescribeRoutineCodeRevisionRequest extends Request {
    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("SelectCodeRevision")
    @Validation(required = true)
    private String selectCodeRevision;

    private DescribeRoutineCodeRevisionRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.selectCodeRevision = builder.selectCodeRevision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRoutineCodeRevisionRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeRoutineCodeRevisionRequest, Builder> {
        private String name; 
        private String selectCodeRevision; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRoutineCodeRevisionRequest request) {
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
         * The version of the JavaScript code that you want to query.
         */
        public Builder selectCodeRevision(String selectCodeRevision) {
            this.putBodyParameter("SelectCodeRevision", selectCodeRevision);
            this.selectCodeRevision = selectCodeRevision;
            return this;
        }

        @Override
        public DescribeRoutineCodeRevisionRequest build() {
            return new DescribeRoutineCodeRevisionRequest(this);
        } 

    } 

}
