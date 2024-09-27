// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAccountFactoryBaselineResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountFactoryBaselineResponseBody</p>
 */
public class GetAccountFactoryBaselineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BaselineId")
    private String baselineId;

    @com.aliyun.core.annotation.NameInMap("BaselineItems")
    private java.util.List < BaselineItems> baselineItems;

    @com.aliyun.core.annotation.NameInMap("BaselineName")
    private String baselineName;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private GetAccountFactoryBaselineResponseBody(Builder builder) {
        this.baselineId = builder.baselineId;
        this.baselineItems = builder.baselineItems;
        this.baselineName = builder.baselineName;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.type = builder.type;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountFactoryBaselineResponseBody create() {
        return builder().build();
    }

    /**
     * @return baselineId
     */
    public String getBaselineId() {
        return this.baselineId;
    }

    /**
     * @return baselineItems
     */
    public java.util.List < BaselineItems> getBaselineItems() {
        return this.baselineItems;
    }

    /**
     * @return baselineName
     */
    public String getBaselineName() {
        return this.baselineName;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String baselineId; 
        private java.util.List < BaselineItems> baselineItems; 
        private String baselineName; 
        private String createTime; 
        private String description; 
        private String requestId; 
        private String type; 
        private String updateTime; 

        /**
         * <p>The baseline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>afb-bp16ae2k8a3yo3d*****</p>
         */
        public Builder baselineId(String baselineId) {
            this.baselineId = baselineId;
            return this;
        }

        /**
         * <p>The baseline items.</p>
         */
        public Builder baselineItems(java.util.List < BaselineItems> baselineItems) {
            this.baselineItems = baselineItems;
            return this;
        }

        /**
         * <p>The name of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        public Builder baselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }

        /**
         * <p>The time when the baseline was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-28T00:46:34Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Default baseline</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>60D54503-F1F6-51B6-B6FA-A70CBDA2A68C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The type of the baseline. Valid values:</p>
         * <ul>
         * <li>System: default baseline.</li>
         * <li>Custom: custom baseline.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The time when the baseline was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-02T01:00:07Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetAccountFactoryBaselineResponseBody build() {
            return new GetAccountFactoryBaselineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAccountFactoryBaselineResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccountFactoryBaselineResponseBody</p>
     */
    public static class BaselineItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private BaselineItems(Builder builder) {
            this.config = builder.config;
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaselineItems create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String config; 
            private String name; 
            private String version; 

            /**
             * <p>The configuration of the baseline item.</p>
             * <p>The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Notifications&quot;:[{&quot;GroupKey&quot;:&quot;account_msg&quot;,&quot;Contacts&quot;:[{&quot;Name&quot;:&quot;aa&quot;}],&quot;PmsgStatus&quot;:1,&quot;EmailStatus&quot;:1,&quot;SmsStatus&quot;:1}]}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The name of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>1097526274671790</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public BaselineItems build() {
                return new BaselineItems(this);
            } 

        } 

    }
}
