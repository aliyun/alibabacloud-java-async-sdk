// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDevicePropertiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDevicePropertiesResponseBody</p>
 */
public class ListDevicePropertiesResponseBody extends TeaModel {
    @NameInMap("DeviceProperties")
    private java.util.List < DeviceProperties> deviceProperties;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private Integer nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListDevicePropertiesResponseBody(Builder builder) {
        this.deviceProperties = builder.deviceProperties;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDevicePropertiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceProperties
     */
    public java.util.List < DeviceProperties> getDeviceProperties() {
        return this.deviceProperties;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public Integer getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DeviceProperties> deviceProperties; 
        private Integer maxResults; 
        private Integer nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * DeviceProperties.
         */
        public Builder deviceProperties(java.util.List < DeviceProperties> deviceProperties) {
            this.deviceProperties = deviceProperties;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(Integer nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDevicePropertiesResponseBody build() {
            return new ListDevicePropertiesResponseBody(this);
        } 

    } 

    public static class DeviceProperties extends TeaModel {
        @NameInMap("BuiltIn")
        private Boolean builtIn;

        @NameInMap("DeviceFormId")
        private String deviceFormId;

        @NameInMap("DeviceFormName")
        private String deviceFormName;

        @NameInMap("DevicePropertyId")
        private String devicePropertyId;

        @NameInMap("PropertyContent")
        private String propertyContent;

        @NameInMap("PropertyFormat")
        private String propertyFormat;

        @NameInMap("PropertyKey")
        private String propertyKey;

        @NameInMap("PropertyName")
        private String propertyName;

        private DeviceProperties(Builder builder) {
            this.builtIn = builder.builtIn;
            this.deviceFormId = builder.deviceFormId;
            this.deviceFormName = builder.deviceFormName;
            this.devicePropertyId = builder.devicePropertyId;
            this.propertyContent = builder.propertyContent;
            this.propertyFormat = builder.propertyFormat;
            this.propertyKey = builder.propertyKey;
            this.propertyName = builder.propertyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceProperties create() {
            return builder().build();
        }

        /**
         * @return builtIn
         */
        public Boolean getBuiltIn() {
            return this.builtIn;
        }

        /**
         * @return deviceFormId
         */
        public String getDeviceFormId() {
            return this.deviceFormId;
        }

        /**
         * @return deviceFormName
         */
        public String getDeviceFormName() {
            return this.deviceFormName;
        }

        /**
         * @return devicePropertyId
         */
        public String getDevicePropertyId() {
            return this.devicePropertyId;
        }

        /**
         * @return propertyContent
         */
        public String getPropertyContent() {
            return this.propertyContent;
        }

        /**
         * @return propertyFormat
         */
        public String getPropertyFormat() {
            return this.propertyFormat;
        }

        /**
         * @return propertyKey
         */
        public String getPropertyKey() {
            return this.propertyKey;
        }

        /**
         * @return propertyName
         */
        public String getPropertyName() {
            return this.propertyName;
        }

        public static final class Builder {
            private Boolean builtIn; 
            private String deviceFormId; 
            private String deviceFormName; 
            private String devicePropertyId; 
            private String propertyContent; 
            private String propertyFormat; 
            private String propertyKey; 
            private String propertyName; 

            /**
             * BuiltIn.
             */
            public Builder builtIn(Boolean builtIn) {
                this.builtIn = builtIn;
                return this;
            }

            /**
             * DeviceFormId.
             */
            public Builder deviceFormId(String deviceFormId) {
                this.deviceFormId = deviceFormId;
                return this;
            }

            /**
             * DeviceFormName.
             */
            public Builder deviceFormName(String deviceFormName) {
                this.deviceFormName = deviceFormName;
                return this;
            }

            /**
             * DevicePropertyId.
             */
            public Builder devicePropertyId(String devicePropertyId) {
                this.devicePropertyId = devicePropertyId;
                return this;
            }

            /**
             * PropertyContent.
             */
            public Builder propertyContent(String propertyContent) {
                this.propertyContent = propertyContent;
                return this;
            }

            /**
             * PropertyFormat.
             */
            public Builder propertyFormat(String propertyFormat) {
                this.propertyFormat = propertyFormat;
                return this;
            }

            /**
             * PropertyKey.
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * PropertyName.
             */
            public Builder propertyName(String propertyName) {
                this.propertyName = propertyName;
                return this;
            }

            public DeviceProperties build() {
                return new DeviceProperties(this);
            } 

        } 

    }
}
