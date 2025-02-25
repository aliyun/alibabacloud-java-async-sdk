// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CommitStagingRoutineCodeRequest} extends {@link RequestModel}
 *
 * <p>CommitStagingRoutineCodeRequest</p>
 */
public class CommitStagingRoutineCodeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeDescription")
    @com.aliyun.core.annotation.Validation(required = true)
    private String codeDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CommitStagingRoutineCodeRequest(Builder builder) {
        super(builder);
        this.codeDescription = builder.codeDescription;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommitStagingRoutineCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeDescription
     */
    public String getCodeDescription() {
        return this.codeDescription;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CommitStagingRoutineCodeRequest, Builder> {
        private String codeDescription; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CommitStagingRoutineCodeRequest request) {
            super(request);
            this.codeDescription = request.codeDescription;
            this.name = request.name;
        } 

        /**
         * <p>The description of the code version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello World</p>
         */
        public Builder codeDescription(String codeDescription) {
            this.putBodyParameter("CodeDescription", codeDescription);
            this.codeDescription = codeDescription;
            return this;
        }

        /**
         * <p>The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CommitStagingRoutineCodeRequest build() {
            return new CommitStagingRoutineCodeRequest(this);
        } 

    } 

}
