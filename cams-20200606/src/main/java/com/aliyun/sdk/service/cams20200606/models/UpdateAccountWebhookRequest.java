// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateAccountWebhookRequest} extends {@link RequestModel}
 *
 * <p>UpdateAccountWebhookRequest</p>
 */
public class UpdateAccountWebhookRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpFlag")
    private String httpFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueFlag")
    private String queueFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusCallbackUrl")
    private String statusCallbackUrl;

    private UpdateAccountWebhookRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.httpFlag = builder.httpFlag;
        this.queueFlag = builder.queueFlag;
        this.statusCallbackUrl = builder.statusCallbackUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAccountWebhookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return httpFlag
     */
    public String getHttpFlag() {
        return this.httpFlag;
    }

    /**
     * @return queueFlag
     */
    public String getQueueFlag() {
        return this.queueFlag;
    }

    /**
     * @return statusCallbackUrl
     */
    public String getStatusCallbackUrl() {
        return this.statusCallbackUrl;
    }

    public static final class Builder extends Request.Builder<UpdateAccountWebhookRequest, Builder> {
        private String custSpaceId; 
        private String httpFlag; 
        private String queueFlag; 
        private String statusCallbackUrl; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAccountWebhookRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.httpFlag = request.httpFlag;
            this.queueFlag = request.queueFlag;
            this.statusCallbackUrl = request.statusCallbackUrl;
        } 

        /**
         * <p>The space ID of the RAM user within the independent software vendor (ISV) account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>293483938849493**</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>Specifies whether to use HTTP callbacks to receive message receipts. Valid values:</p>
         * <ul>
         * <li>Y: indicates that HTTP callbacks are used to receive receipts.</li>
         * <li>N: indicates that HTTP callbacks are not used to receive receipts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder httpFlag(String httpFlag) {
            this.putQueryParameter("HttpFlag", httpFlag);
            this.httpFlag = httpFlag;
            return this;
        }

        /**
         * <p>Specifies whether to use Message Service (MNS) queues to receive receipts. Valid values:</p>
         * <ul>
         * <li>Y: indicates that MNS queues are used to receive receipts.</li>
         * <li>N: indicates that MNS queues are not used to receive receipts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        public Builder queueFlag(String queueFlag) {
            this.putQueryParameter("QueueFlag", queueFlag);
            this.queueFlag = queueFlag;
            return this;
        }

        /**
         * <p>The callback URL to which status reports are sent by using HTTP callbacks.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
         */
        public Builder statusCallbackUrl(String statusCallbackUrl) {
            this.putQueryParameter("StatusCallbackUrl", statusCallbackUrl);
            this.statusCallbackUrl = statusCallbackUrl;
            return this;
        }

        @Override
        public UpdateAccountWebhookRequest build() {
            return new UpdateAccountWebhookRequest(this);
        } 

    } 

}
