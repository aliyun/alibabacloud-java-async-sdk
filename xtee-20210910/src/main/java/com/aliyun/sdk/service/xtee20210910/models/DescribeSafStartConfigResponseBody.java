// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSafStartConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSafStartConfigResponseBody</p>
 */
public class DescribeSafStartConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeSafStartConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSafStartConfigResponseBody create() {
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

        public DescribeSafStartConfigResponseBody build() {
            return new DescribeSafStartConfigResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deviceTypes")
        private java.util.List < String > deviceTypes;

        @com.aliyun.core.annotation.NameInMap("eventCodes")
        private java.util.List < String > eventCodes;

        @com.aliyun.core.annotation.NameInMap("languages")
        private java.util.List < String > languages;

        @com.aliyun.core.annotation.NameInMap("serverRegions")
        private java.util.List < String > serverRegions;

        private ResultObject(Builder builder) {
            this.deviceTypes = builder.deviceTypes;
            this.eventCodes = builder.eventCodes;
            this.languages = builder.languages;
            this.serverRegions = builder.serverRegions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return deviceTypes
         */
        public java.util.List < String > getDeviceTypes() {
            return this.deviceTypes;
        }

        /**
         * @return eventCodes
         */
        public java.util.List < String > getEventCodes() {
            return this.eventCodes;
        }

        /**
         * @return languages
         */
        public java.util.List < String > getLanguages() {
            return this.languages;
        }

        /**
         * @return serverRegions
         */
        public java.util.List < String > getServerRegions() {
            return this.serverRegions;
        }

        public static final class Builder {
            private java.util.List < String > deviceTypes; 
            private java.util.List < String > eventCodes; 
            private java.util.List < String > languages; 
            private java.util.List < String > serverRegions; 

            /**
             * deviceTypes.
             */
            public Builder deviceTypes(java.util.List < String > deviceTypes) {
                this.deviceTypes = deviceTypes;
                return this;
            }

            /**
             * eventCodes.
             */
            public Builder eventCodes(java.util.List < String > eventCodes) {
                this.eventCodes = eventCodes;
                return this;
            }

            /**
             * languages.
             */
            public Builder languages(java.util.List < String > languages) {
                this.languages = languages;
                return this;
            }

            /**
             * serverRegions.
             */
            public Builder serverRegions(java.util.List < String > serverRegions) {
                this.serverRegions = serverRegions;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
