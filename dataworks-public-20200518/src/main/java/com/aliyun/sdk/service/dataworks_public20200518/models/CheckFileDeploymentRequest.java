// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link CheckFileDeploymentRequest} extends {@link RequestModel}
 *
 * <p>CheckFileDeploymentRequest</p>
 */
public class CheckFileDeploymentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckDetailUrl")
    private String checkDetailUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckerInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String checkerInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private CheckFileDeploymentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkDetailUrl = builder.checkDetailUrl;
        this.checkerInstanceId = builder.checkerInstanceId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckFileDeploymentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return checkDetailUrl
     */
    public String getCheckDetailUrl() {
        return this.checkDetailUrl;
    }

    /**
     * @return checkerInstanceId
     */
    public String getCheckerInstanceId() {
        return this.checkerInstanceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<CheckFileDeploymentRequest, Builder> {
        private String regionId; 
        private String checkDetailUrl; 
        private String checkerInstanceId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(CheckFileDeploymentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkDetailUrl = request.checkDetailUrl;
            this.checkerInstanceId = request.checkerInstanceId;
            this.status = request.status;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://result.aliyun.com/?checkerInstanceId=">https://result.aliyun.com/?checkerInstanceId=</a></p>
         */
        public Builder checkDetailUrl(String checkDetailUrl) {
            this.putBodyParameter("CheckDetailUrl", checkDetailUrl);
            this.checkDetailUrl = checkDetailUrl;
            return this;
        }

        /**
         * <p>The ID of the instance to which the file checker belongs. You can obtain the ID from the CheckerInstanceId parameter in the check event logs returned by DataWorks.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>66_123455623_2</p>
         */
        public Builder checkerInstanceId(String checkerInstanceId) {
            this.putBodyParameter("CheckerInstanceId", checkerInstanceId);
            this.checkerInstanceId = checkerInstanceId;
            return this;
        }

        /**
         * <p>The check status of the file that you want to deploy. Valid values:</p>
         * <ul>
         * <li>OK: The file passes the check.</li>
         * <li>WARN: The file passes the check, but an alert is reported.</li>
         * <li>FAIL: The file fails the check.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public CheckFileDeploymentRequest build() {
            return new CheckFileDeploymentRequest(this);
        } 

    } 

}
