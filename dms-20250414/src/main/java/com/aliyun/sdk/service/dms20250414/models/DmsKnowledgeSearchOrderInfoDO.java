// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DmsKnowledgeSearchOrderInfoDO} extends {@link TeaModel}
 *
 * <p>DmsKnowledgeSearchOrderInfoDO</p>
 */
public class DmsKnowledgeSearchOrderInfoDO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliyunAccountUid")
    private String aliyunAccountUid;

    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("WebSearchApiUrl")
    private String webSearchApiUrl;

    private DmsKnowledgeSearchOrderInfoDO(Builder builder) {
        this.aliyunAccountUid = builder.aliyunAccountUid;
        this.apiKey = builder.apiKey;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.orderId = builder.orderId;
        this.webSearchApiUrl = builder.webSearchApiUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DmsKnowledgeSearchOrderInfoDO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunAccountUid
     */
    public String getAliyunAccountUid() {
        return this.aliyunAccountUid;
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return webSearchApiUrl
     */
    public String getWebSearchApiUrl() {
        return this.webSearchApiUrl;
    }

    public static final class Builder {
        private String aliyunAccountUid; 
        private String apiKey; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private String orderId; 
        private String webSearchApiUrl; 

        private Builder() {
        } 

        private Builder(DmsKnowledgeSearchOrderInfoDO model) {
            this.aliyunAccountUid = model.aliyunAccountUid;
            this.apiKey = model.apiKey;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.orderId = model.orderId;
            this.webSearchApiUrl = model.webSearchApiUrl;
        } 

        /**
         * AliyunAccountUid.
         */
        public Builder aliyunAccountUid(String aliyunAccountUid) {
            this.aliyunAccountUid = aliyunAccountUid;
            return this;
        }

        /**
         * ApiKey.
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * WebSearchApiUrl.
         */
        public Builder webSearchApiUrl(String webSearchApiUrl) {
            this.webSearchApiUrl = webSearchApiUrl;
            return this;
        }

        public DmsKnowledgeSearchOrderInfoDO build() {
            return new DmsKnowledgeSearchOrderInfoDO(this);
        } 

    } 

}
