// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSampleInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSampleInfoResponseBody</p>
 */
public class DescribeSampleInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeSampleInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSampleInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeSampleInfoResponseBody build() {
            return new DescribeSampleInfoResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("sampleTags")
        private String sampleTags;

        @com.aliyun.core.annotation.NameInMap("sampleType")
        private String sampleType;

        @com.aliyun.core.annotation.NameInMap("sampleValue")
        private String sampleValue;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("version")
        private Integer version;

        private ResultObject(Builder builder) {
            this.id = builder.id;
            this.sampleTags = builder.sampleTags;
            this.sampleType = builder.sampleType;
            this.sampleValue = builder.sampleValue;
            this.updateTime = builder.updateTime;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return sampleTags
         */
        public String getSampleTags() {
            return this.sampleTags;
        }

        /**
         * @return sampleType
         */
        public String getSampleType() {
            return this.sampleType;
        }

        /**
         * @return sampleValue
         */
        public String getSampleValue() {
            return this.sampleValue;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long id; 
            private String sampleTags; 
            private String sampleType; 
            private String sampleValue; 
            private String updateTime; 
            private Integer version; 

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * sampleTags.
             */
            public Builder sampleTags(String sampleTags) {
                this.sampleTags = sampleTags;
                return this;
            }

            /**
             * sampleType.
             */
            public Builder sampleType(String sampleType) {
                this.sampleType = sampleType;
                return this;
            }

            /**
             * sampleValue.
             */
            public Builder sampleValue(String sampleValue) {
                this.sampleValue = sampleValue;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
