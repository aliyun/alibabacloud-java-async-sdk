// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeCheckWarningDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCheckWarningDetailResponseBody</p>
 */
public class DescribeCheckWarningDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Advice")
    private String advice;

    @com.aliyun.core.annotation.NameInMap("CheckDetailAssetInfo")
    private java.util.List<java.util.Map<String, String>> checkDetailAssetInfo;

    @com.aliyun.core.annotation.NameInMap("CheckDetailColumns")
    private java.util.List<CheckDetailColumns> checkDetailColumns;

    @com.aliyun.core.annotation.NameInMap("CheckId")
    private Long checkId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Item")
    private String item;

    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeCheckWarningDetailResponseBody(Builder builder) {
        this.advice = builder.advice;
        this.checkDetailAssetInfo = builder.checkDetailAssetInfo;
        this.checkDetailColumns = builder.checkDetailColumns;
        this.checkId = builder.checkId;
        this.description = builder.description;
        this.item = builder.item;
        this.level = builder.level;
        this.prompt = builder.prompt;
        this.requestId = builder.requestId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCheckWarningDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advice
     */
    public String getAdvice() {
        return this.advice;
    }

    /**
     * @return checkDetailAssetInfo
     */
    public java.util.List<java.util.Map<String, String>> getCheckDetailAssetInfo() {
        return this.checkDetailAssetInfo;
    }

    /**
     * @return checkDetailColumns
     */
    public java.util.List<CheckDetailColumns> getCheckDetailColumns() {
        return this.checkDetailColumns;
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return item
     */
    public String getItem() {
        return this.item;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
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

    public static final class Builder {
        private String advice; 
        private java.util.List<java.util.Map<String, String>> checkDetailAssetInfo; 
        private java.util.List<CheckDetailColumns> checkDetailColumns; 
        private Long checkId; 
        private String description; 
        private String item; 
        private String level; 
        private String prompt; 
        private String requestId; 
        private String type; 

        private Builder() {
        } 

        private Builder(DescribeCheckWarningDetailResponseBody model) {
            this.advice = model.advice;
            this.checkDetailAssetInfo = model.checkDetailAssetInfo;
            this.checkDetailColumns = model.checkDetailColumns;
            this.checkId = model.checkId;
            this.description = model.description;
            this.item = model.item;
            this.level = model.level;
            this.prompt = model.prompt;
            this.requestId = model.requestId;
            this.type = model.type;
        } 

        /**
         * <p>The hardening suggestion for the baseline check risk item.</p>
         * 
         * <strong>example:</strong>
         * <p>You can fix it in the following ways:↵1. To configure authentication for redis service, click the redis.conf Configure complex password in requirepass, and then restart redis.↵2. In redis configuration file redis.conf The configuration is as follows: bind 127.0.0.1, only allow local access, and then restart redis</p>
         */
        public Builder advice(String advice) {
            this.advice = advice;
            return this;
        }

        /**
         * <p>The list of checked asset details.</p>
         */
        public Builder checkDetailAssetInfo(java.util.List<java.util.Map<String, String>> checkDetailAssetInfo) {
            this.checkDetailAssetInfo = checkDetailAssetInfo;
            return this;
        }

        /**
         * <p>The check content details.</p>
         */
        public Builder checkDetailColumns(java.util.List<CheckDetailColumns> checkDetailColumns) {
            this.checkDetailColumns = checkDetailColumns;
            return this;
        }

        /**
         * <p>The ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>946</p>
         */
        public Builder checkId(Long checkId) {
            this.checkId = checkId;
            return this;
        }

        /**
         * <p>The supplementary description of the baseline check risk item.</p>
         * 
         * <strong>example:</strong>
         * <p>The redis port is open to the outside world and there is no authentication option configured. In addition to directly obtaining all the information in the database, unauthorized users can also attack the system through unauthorized access vulnerability.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Redis unauthorized access</p>
         */
        public Builder item(String item) {
            this.item = item;
            return this;
        }

        /**
         * <p>The risk level of the check item. Valid values:</p>
         * <ul>
         * <li><p><strong>high</strong>: High risk, highlighted in red.</p>
         * </li>
         * <li><p><strong>medium</strong>: Medium risk, highlighted in orange.</p>
         * </li>
         * <li><p><strong>low</strong>: Low risk, highlighted in gray.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        public Builder level(String level) {
            this.level = level;
            return this;
        }

        /**
         * <p>The check prompt for the baseline check risk item.</p>
         */
        public Builder prompt(String prompt) {
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>The request ID. Alibaba Cloud generates a unique identifier for each request. You can use the request ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>BE120DAB-F4E7-4C53-ADC3-A97578ABF384</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The type of the baseline check item.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeRiskType~~">DescribeRiskType</a> operation to view all baseline types.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Security audit</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeCheckWarningDetailResponseBody build() {
            return new DescribeCheckWarningDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCheckWarningDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCheckWarningDetailResponseBody</p>
     */
    public static class Grids extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Grids(Builder builder) {
            this.key = builder.key;
            this.showName = builder.showName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Grids create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String key; 
            private String showName; 
            private String type; 

            private Builder() {
            } 

            private Builder(Grids model) {
                this.key = model.key;
                this.showName = model.showName;
                this.type = model.type;
            } 

            /**
             * <p>The key of the check content.</p>
             * 
             * <strong>example:</strong>
             * <p>Username</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The display name corresponding to the check content key.</p>
             * 
             * <strong>example:</strong>
             * <p>UserName</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * <p>The display type. Valid values:</p>
             * <ul>
             * <li><strong>grid</strong>: check grid</li>
             * <li><strong>text</strong>: text</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Grids build() {
                return new Grids(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCheckWarningDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCheckWarningDetailResponseBody</p>
     */
    public static class CheckDetailColumns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Grids")
        private java.util.List<Grids> grids;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private CheckDetailColumns(Builder builder) {
            this.grids = builder.grids;
            this.key = builder.key;
            this.showName = builder.showName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckDetailColumns create() {
            return builder().build();
        }

        /**
         * @return grids
         */
        public java.util.List<Grids> getGrids() {
            return this.grids;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<Grids> grids; 
            private String key; 
            private String showName; 
            private String type; 

            private Builder() {
            } 

            private Builder(CheckDetailColumns model) {
                this.grids = model.grids;
                this.key = model.key;
                this.showName = model.showName;
                this.type = model.type;
            } 

            /**
             * <p>The list of check content.</p>
             */
            public Builder grids(java.util.List<Grids> grids) {
                this.grids = grids;
                return this;
            }

            /**
             * <p>The key of the check content.</p>
             * 
             * <strong>example:</strong>
             * <p>Containername</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The display name corresponding to the check content key.</p>
             * 
             * <strong>example:</strong>
             * <p>ContainerName</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * <p>The display type. Valid values:</p>
             * <ul>
             * <li><strong>grid</strong>: check grid</li>
             * <li><strong>text</strong>: text</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CheckDetailColumns build() {
                return new CheckDetailColumns(this);
            } 

        } 

    }
}
