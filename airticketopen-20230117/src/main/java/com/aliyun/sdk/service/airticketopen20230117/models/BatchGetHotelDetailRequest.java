// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link BatchGetHotelDetailRequest} extends {@link RequestModel}
 *
 * <p>BatchGetHotelDetailRequest</p>
 */
public class BatchGetHotelDetailRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StandardHotelIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> standardHotelIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TracerId")
    private String tracerId;

    private BatchGetHotelDetailRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.language = builder.language;
        this.standardHotelIds = builder.standardHotelIds;
        this.tracerId = builder.tracerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetHotelDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountNo
     */
    public Long getAccountNo() {
        return this.accountNo;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return standardHotelIds
     */
    public java.util.List<String> getStandardHotelIds() {
        return this.standardHotelIds;
    }

    /**
     * @return tracerId
     */
    public String getTracerId() {
        return this.tracerId;
    }

    public static final class Builder extends Request.Builder<BatchGetHotelDetailRequest, Builder> {
        private Long accountNo; 
        private String language; 
        private java.util.List<String> standardHotelIds; 
        private String tracerId; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetHotelDetailRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.language = request.language;
            this.standardHotelIds = request.standardHotelIds;
            this.tracerId = request.tracerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder accountNo(Long accountNo) {
            this.putBodyParameter("AccountNo", accountNo);
            this.accountNo = accountNo;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;H001&quot;,&quot;H002&quot;]</p>
         */
        public Builder standardHotelIds(java.util.List<String> standardHotelIds) {
            String standardHotelIdsShrink = shrink(standardHotelIds, "StandardHotelIds", "json");
            this.putBodyParameter("StandardHotelIds", standardHotelIdsShrink);
            this.standardHotelIds = standardHotelIds;
            return this;
        }

        /**
         * <p>TraceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        public Builder tracerId(String tracerId) {
            this.putBodyParameter("TracerId", tracerId);
            this.tracerId = tracerId;
            return this;
        }

        @Override
        public BatchGetHotelDetailRequest build() {
            return new BatchGetHotelDetailRequest(this);
        } 

    } 

}
