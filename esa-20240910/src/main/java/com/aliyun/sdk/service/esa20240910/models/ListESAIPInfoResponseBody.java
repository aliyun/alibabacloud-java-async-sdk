// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListESAIPInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListESAIPInfoResponseBody</p>
 */
public class ListESAIPInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.List<Content> content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListESAIPInfoResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListESAIPInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public java.util.List<Content> getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Content> content; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListESAIPInfoResponseBody model) {
            this.content = model.content;
            this.requestId = model.requestId;
        } 

        /**
         * Content.
         */
        public Builder content(java.util.List<Content> content) {
            this.content = content;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListESAIPInfoResponseBody build() {
            return new ListESAIPInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListESAIPInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListESAIPInfoResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdnIp")
        private String cdnIp;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        private Content(Builder builder) {
            this.cdnIp = builder.cdnIp;
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return cdnIp
         */
        public String getCdnIp() {
            return this.cdnIp;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private String cdnIp; 
            private String ip; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.cdnIp = model.cdnIp;
                this.ip = model.ip;
            } 

            /**
             * CdnIp.
             */
            public Builder cdnIp(String cdnIp) {
                this.cdnIp = cdnIp;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
