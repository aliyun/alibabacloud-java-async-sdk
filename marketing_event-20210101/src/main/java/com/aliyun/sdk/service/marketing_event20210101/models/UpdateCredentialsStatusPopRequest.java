// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateCredentialsStatusPopRequest} extends {@link RequestModel}
 *
 * <p>UpdateCredentialsStatusPopRequest</p>
 */
public class UpdateCredentialsStatusPopRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyRecipientName")
    private String proxyRecipientName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyRecipientPhoneNumber")
    private String proxyRecipientPhoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiptLocation")
    private String receiptLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Time")
    private String time;

    private UpdateCredentialsStatusPopRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.code = builder.code;
        this.proxyRecipientName = builder.proxyRecipientName;
        this.proxyRecipientPhoneNumber = builder.proxyRecipientPhoneNumber;
        this.receiptLocation = builder.receiptLocation;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCredentialsStatusPopRequest create() {
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
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return proxyRecipientName
     */
    public String getProxyRecipientName() {
        return this.proxyRecipientName;
    }

    /**
     * @return proxyRecipientPhoneNumber
     */
    public String getProxyRecipientPhoneNumber() {
        return this.proxyRecipientPhoneNumber;
    }

    /**
     * @return receiptLocation
     */
    public String getReceiptLocation() {
        return this.receiptLocation;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder extends Request.Builder<UpdateCredentialsStatusPopRequest, Builder> {
        private String regionId; 
        private String code; 
        private String proxyRecipientName; 
        private String proxyRecipientPhoneNumber; 
        private String receiptLocation; 
        private String time; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCredentialsStatusPopRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.code = request.code;
            this.proxyRecipientName = request.proxyRecipientName;
            this.proxyRecipientPhoneNumber = request.proxyRecipientPhoneNumber;
            this.receiptLocation = request.receiptLocation;
            this.time = request.time;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * ProxyRecipientName.
         */
        public Builder proxyRecipientName(String proxyRecipientName) {
            this.putQueryParameter("ProxyRecipientName", proxyRecipientName);
            this.proxyRecipientName = proxyRecipientName;
            return this;
        }

        /**
         * ProxyRecipientPhoneNumber.
         */
        public Builder proxyRecipientPhoneNumber(String proxyRecipientPhoneNumber) {
            this.putQueryParameter("ProxyRecipientPhoneNumber", proxyRecipientPhoneNumber);
            this.proxyRecipientPhoneNumber = proxyRecipientPhoneNumber;
            return this;
        }

        /**
         * ReceiptLocation.
         */
        public Builder receiptLocation(String receiptLocation) {
            this.putQueryParameter("ReceiptLocation", receiptLocation);
            this.receiptLocation = receiptLocation;
            return this;
        }

        /**
         * Time.
         */
        public Builder time(String time) {
            this.putQueryParameter("Time", time);
            this.time = time;
            return this;
        }

        @Override
        public UpdateCredentialsStatusPopRequest build() {
            return new UpdateCredentialsStatusPopRequest(this);
        } 

    } 

}
