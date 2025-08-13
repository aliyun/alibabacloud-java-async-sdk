// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeSafStartConfigResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned object</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeSafStartConfigResponseBody build() {
            return new DescribeSafStartConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSafStartConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSafStartConfigResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deviceTypes")
        private java.util.List<String> deviceTypes;

        @com.aliyun.core.annotation.NameInMap("eventCodes")
        private java.util.List<String> eventCodes;

        @com.aliyun.core.annotation.NameInMap("languages")
        private java.util.List<String> languages;

        @com.aliyun.core.annotation.NameInMap("serverRegions")
        private java.util.List<String> serverRegions;

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
        public java.util.List<String> getDeviceTypes() {
            return this.deviceTypes;
        }

        /**
         * @return eventCodes
         */
        public java.util.List<String> getEventCodes() {
            return this.eventCodes;
        }

        /**
         * @return languages
         */
        public java.util.List<String> getLanguages() {
            return this.languages;
        }

        /**
         * @return serverRegions
         */
        public java.util.List<String> getServerRegions() {
            return this.serverRegions;
        }

        public static final class Builder {
            private java.util.List<String> deviceTypes; 
            private java.util.List<String> eventCodes; 
            private java.util.List<String> languages; 
            private java.util.List<String> serverRegions; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.deviceTypes = model.deviceTypes;
                this.eventCodes = model.eventCodes;
                this.languages = model.languages;
                this.serverRegions = model.serverRegions;
            } 

            /**
             * <p>List of device types.</p>
             */
            public Builder deviceTypes(java.util.List<String> deviceTypes) {
                this.deviceTypes = deviceTypes;
                return this;
            }

            /**
             * <p>Event codes.</p>
             */
            public Builder eventCodes(java.util.List<String> eventCodes) {
                this.eventCodes = eventCodes;
                return this;
            }

            /**
             * <p>Configuration language details.</p>
             */
            public Builder languages(java.util.List<String> languages) {
                this.languages = languages;
                return this;
            }

            /**
             * <p>Server region</p>
             */
            public Builder serverRegions(java.util.List<String> serverRegions) {
                this.serverRegions = serverRegions;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
