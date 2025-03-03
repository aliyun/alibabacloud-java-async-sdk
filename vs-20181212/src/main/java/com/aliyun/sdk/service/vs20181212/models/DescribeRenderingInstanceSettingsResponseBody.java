// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeRenderingInstanceSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRenderingInstanceSettingsResponseBody</p>
 */
public class DescribeRenderingInstanceSettingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Settings")
    private java.util.List<Settings> settings;

    private DescribeRenderingInstanceSettingsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.settings = builder.settings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRenderingInstanceSettingsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return settings
     */
    public java.util.List<Settings> getSettings() {
        return this.settings;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Settings> settings; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Settings.
         */
        public Builder settings(java.util.List<Settings> settings) {
            this.settings = settings;
            return this;
        }

        public DescribeRenderingInstanceSettingsResponseBody build() {
            return new DescribeRenderingInstanceSettingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRenderingInstanceSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenderingInstanceSettingsResponseBody</p>
     */
    public static class Settings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeName")
        private String attributeName;

        @com.aliyun.core.annotation.NameInMap("AttributeValue")
        private String attributeValue;

        private Settings(Builder builder) {
            this.attributeName = builder.attributeName;
            this.attributeValue = builder.attributeValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Settings create() {
            return builder().build();
        }

        /**
         * @return attributeName
         */
        public String getAttributeName() {
            return this.attributeName;
        }

        /**
         * @return attributeValue
         */
        public String getAttributeValue() {
            return this.attributeValue;
        }

        public static final class Builder {
            private String attributeName; 
            private String attributeValue; 

            /**
             * AttributeName.
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * AttributeValue.
             */
            public Builder attributeValue(String attributeValue) {
                this.attributeValue = attributeValue;
                return this;
            }

            public Settings build() {
                return new Settings(this);
            } 

        } 

    }
}
