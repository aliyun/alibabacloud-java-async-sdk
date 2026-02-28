// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateProductDistributeJobRequest} extends {@link RequestModel}
 *
 * <p>CreateProductDistributeJobRequest</p>
 */
public class CreateProductDistributeJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetAliyunId")
    private String targetAliyunId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetUid")
    private String targetUid;

    private CreateProductDistributeJobRequest(Builder builder) {
        super(builder);
        this.productKey = builder.productKey;
        this.sourceInstanceId = builder.sourceInstanceId;
        this.targetAliyunId = builder.targetAliyunId;
        this.targetInstanceId = builder.targetInstanceId;
        this.targetUid = builder.targetUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductDistributeJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    /**
     * @return targetAliyunId
     */
    public String getTargetAliyunId() {
        return this.targetAliyunId;
    }

    /**
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    /**
     * @return targetUid
     */
    public String getTargetUid() {
        return this.targetUid;
    }

    public static final class Builder extends Request.Builder<CreateProductDistributeJobRequest, Builder> {
        private String productKey; 
        private String sourceInstanceId; 
        private String targetAliyunId; 
        private String targetInstanceId; 
        private String targetUid; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductDistributeJobRequest request) {
            super(request);
            this.productKey = request.productKey;
            this.sourceInstanceId = request.sourceInstanceId;
            this.targetAliyunId = request.targetAliyunId;
            this.targetInstanceId = request.targetInstanceId;
            this.targetUid = request.targetUid;
        } 

        /**
         * <p>The <strong>ProductKey</strong> of the product to be published.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The ID of the source instance to which the product belongs.</p>
         * <ul>
         * <li><p>The IDs of public instances in different regions:</p>
         * <ul>
         * <li>China (Shanghai): iotx-oxssharez200.</li>
         * <li>Japan (Tokyo): iotx-oxssharez300.</li>
         * <li>Singapore (Singapore): iotx-oxssharez400.</li>
         * <li>US (Silicon Valley): iotx-oxssharez500.</li>
         * <li>US (Virginia): iotx-oxssharez600.</li>
         * <li>Germany (Frankfurt): iotx-oxssharez700.</li>
         * </ul>
         * </li>
         * <li><p>The IDs of Enterprise Edition instances:</p>
         * <p>1. Log on to the IoT Platform console. Select a region from the drop-down list in the upper-left corner of the top navigation bar.</p>
         * <p>2. On the <strong>Overview</strong> page, click the instance name. On the <strong>Instance Details</strong> page, view the instance ID in the <strong>Basic Information</strong> section.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-st2***</p>
         */
        public Builder sourceInstanceId(String sourceInstanceId) {
            this.putQueryParameter("SourceInstanceId", sourceInstanceId);
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account to which the product belongs. You can log on to the IoT Platform console, click the profile picture, and then view <strong>Logon Account</strong> on the <strong>Security Settings</strong> page.</p>
         * <p>The <strong>TargetUid</strong> and <strong>TargetAliyunId</strong> parameters cannot be left empty at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>io****@example.com</p>
         */
        public Builder targetAliyunId(String targetAliyunId) {
            this.putQueryParameter("TargetAliyunId", targetAliyunId);
            this.targetAliyunId = targetAliyunId;
            return this;
        }

        /**
         * <p>The ID of the destination instance to which the product is distributed. For more information about instance IDs, see the description of the <strong>SourceInstanceId</strong> parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-6ja***</p>
         */
        public Builder targetInstanceId(String targetInstanceId) {
            this.putQueryParameter("TargetInstanceId", targetInstanceId);
            this.targetInstanceId = targetInstanceId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the product belongs. You can log on to the IoT Platform console, click the profile picture, and then view <strong>Account ID</strong> on the <strong>Security Settings</strong> page.</p>
         * <p>The <strong>TargetUid</strong> and <strong>TargetAliyunId</strong> parameters cannot be left empty at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>198***</p>
         */
        public Builder targetUid(String targetUid) {
            this.putQueryParameter("TargetUid", targetUid);
            this.targetUid = targetUid;
            return this;
        }

        @Override
        public CreateProductDistributeJobRequest build() {
            return new CreateProductDistributeJobRequest(this);
        } 

    } 

}
