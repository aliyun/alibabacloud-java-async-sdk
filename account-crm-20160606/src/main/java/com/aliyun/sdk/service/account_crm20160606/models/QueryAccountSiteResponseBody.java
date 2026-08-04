// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link QueryAccountSiteResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAccountSiteResponseBody</p>
 */
public class QueryAccountSiteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Site")
    private String site;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAccountSiteResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
        this.site = builder.site;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountSiteResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return site
     */
    public String getSite() {
        return this.site;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String requestId; 
        private String site; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAccountSiteResponseBody model) {
            this.code = model.code;
            this.requestId = model.requestId;
            this.site = model.site;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Site.
         */
        public Builder site(String site) {
            this.site = site;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAccountSiteResponseBody build() {
            return new QueryAccountSiteResponseBody(this);
        } 

    } 

}
