// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetMediaConnectAvailableRegionResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaConnectAvailableRegionResponseBody</p>
 */
public class GetMediaConnectAvailableRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetCode")
    private Integer retCode;

    private GetMediaConnectAvailableRegionResponseBody(Builder builder) {
        this.content = builder.content;
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.retCode = builder.retCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaConnectAvailableRegionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retCode
     */
    public Integer getRetCode() {
        return this.retCode;
    }

    public static final class Builder {
        private Content content; 
        private String description; 
        private String requestId; 
        private Integer retCode; 

        private Builder() {
        } 

        private Builder(GetMediaConnectAvailableRegionResponseBody model) {
            this.content = model.content;
            this.description = model.description;
            this.requestId = model.requestId;
            this.retCode = model.retCode;
        } 

        /**
         * <p>The rsponse body.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The call description.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>41CB9D4C-4650-5723-BA89-D6824F706ACB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned error code. A value of 0 indicates the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder retCode(Integer retCode) {
            this.retCode = retCode;
            return this;
        }

        public GetMediaConnectAvailableRegionResponseBody build() {
            return new GetMediaConnectAvailableRegionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMediaConnectAvailableRegionResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaConnectAvailableRegionResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultRegion")
        private String defaultRegion;

        @com.aliyun.core.annotation.NameInMap("RegionList")
        private java.util.List<String> regionList;

        private Content(Builder builder) {
            this.defaultRegion = builder.defaultRegion;
            this.regionList = builder.regionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return defaultRegion
         */
        public String getDefaultRegion() {
            return this.defaultRegion;
        }

        /**
         * @return regionList
         */
        public java.util.List<String> getRegionList() {
            return this.regionList;
        }

        public static final class Builder {
            private String defaultRegion; 
            private java.util.List<String> regionList; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.defaultRegion = model.defaultRegion;
                this.regionList = model.regionList;
            } 

            /**
             * <p>The default region. You can ignore the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder defaultRegion(String defaultRegion) {
                this.defaultRegion = defaultRegion;
                return this;
            }

            /**
             * <p>The supported regions.</p>
             */
            public Builder regionList(java.util.List<String> regionList) {
                this.regionList = regionList;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
