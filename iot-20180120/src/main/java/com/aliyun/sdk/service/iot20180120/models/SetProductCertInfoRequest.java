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
 * {@link SetProductCertInfoRequest} extends {@link RequestModel}
 *
 * <p>SetProductCertInfoRequest</p>
 */
public class SetProductCertInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IssueModel")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer issueModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    private SetProductCertInfoRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.issueModel = builder.issueModel;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetProductCertInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return issueModel
     */
    public Integer getIssueModel() {
        return this.issueModel;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<SetProductCertInfoRequest, Builder> {
        private String iotInstanceId; 
        private Integer issueModel; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(SetProductCertInfoRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.issueModel = request.issueModel;
            this.productKey = request.productKey;
        } 

        /**
         * <p>The ID of the instance. You can view the ID of the instance on the <strong>Overview</strong> page in the IoT Platform console.****</p>
         * <blockquote>
         * <p> If your instance has an ID, you must specify the ID for the parameter. Otherwise, the call fails. If no Overview page or ID is generated for your instance, you do not need configure this parameter.</p>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-0pp1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The source from which the X.509 certificate is issued.</p>
         * <ul>
         * <li><strong>1</strong>: The X.509 certificate is issued by IoT Platform.</li>
         * <li><strong>3</strong>: The X.509 certificate is issued by a third-party platform.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder issueModel(Integer issueModel) {
            this.putQueryParameter("IssueModel", issueModel);
            this.issueModel = issueModel;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aS2dewS****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public SetProductCertInfoRequest build() {
            return new SetProductCertInfoRequest(this);
        } 

    } 

}
