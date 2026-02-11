// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ApplyBastionAccountRequest} extends {@link RequestModel}
 *
 * <p>ApplyBastionAccountRequest</p>
 */
public class ApplyBastionAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private Long mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    private ApplyBastionAccountRequest(Builder builder) {
        super(builder);
        this.mobile = builder.mobile;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyBastionAccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mobile
     */
    public Long getMobile() {
        return this.mobile;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<ApplyBastionAccountRequest, Builder> {
        private Long mobile; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(ApplyBastionAccountRequest request) {
            super(request);
            this.mobile = request.mobile;
            this.projectId = request.projectId;
        } 

        /**
         * <p>Mobile Phone Number</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder mobile(Long mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>Project ID</p>
         * 
         * <strong>example:</strong>
         * <p>90912</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ApplyBastionAccountRequest build() {
            return new ApplyBastionAccountRequest(this);
        } 

    } 

}
