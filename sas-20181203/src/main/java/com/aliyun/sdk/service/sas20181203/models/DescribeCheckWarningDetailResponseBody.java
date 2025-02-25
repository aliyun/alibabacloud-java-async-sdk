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

        /**
         * <p>The suggestion for the management of the risk item.</p>
         * 
         * <strong>example:</strong>
         * <p>You can fix it in the following ways:↵1. To configure authentication for redis service, click the redis.conf Configure complex password in requirepass, and then restart redis.↵2. In redis configuration file redis.conf The configuration is as follows: bind 127.0.0.1, only allow local access, and then restart redis</p>
         */
        public Builder advice(String advice) {
            this.advice = advice;
            return this;
        }

        /**
         * <p>List of asset details to check.</p>
         */
        public Builder checkDetailAssetInfo(java.util.List<java.util.Map<String, String>> checkDetailAssetInfo) {
            this.checkDetailAssetInfo = checkDetailAssetInfo;
            return this;
        }

        /**
         * <p>Detection content details.</p>
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
         * <p>The additional information about the risk item.</p>
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
         * <li><strong>high</strong>: The item is a high-risk item and is highlighted in red.</li>
         * <li><strong>medium</strong>: The item is a medium-risk item and is highlighted in orange.</li>
         * <li><strong>low</strong>: The item is a low-risk item and is highlighted in gray.</li>
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
         * <p>The prompt for the risk item.</p>
         */
        public Builder prompt(String prompt) {
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>BE120DAB-F4E7-4C53-ADC3-A97578ABF384</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The type of the check item. Valid values:</p>
         * <ul>
         * <li><strong>hc_exploit</strong>: unauthorized access</li>
         * <li><strong>hc_djbh</strong>: classified protection compliance</li>
         * <li><strong>hc_best_secruity</strong>: best security practice</li>
         * <li><strong>hc_container</strong>: container security</li>
         * <li><strong>hc_custom</strong>: custom baseline</li>
         * <li><strong>cis</strong>: Center for Internet Security (CIS) compliance</li>
         * <li><strong>weak_password</strong>: weak password</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hc_exploit</p>
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

            /**
             * <p>Key to detect content.</p>
             * 
             * <strong>example:</strong>
             * <p>Username</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The detection content key corresponds to the display name.</p>
             * 
             * <strong>example:</strong>
             * <p>UserName</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * <p>Display type. Value:</p>
             * <ul>
             * <li><strong>grid</strong>: Detection grid</li>
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

            /**
             * <p>Detection content list.</p>
             */
            public Builder grids(java.util.List<Grids> grids) {
                this.grids = grids;
                return this;
            }

            /**
             * <p>Key to detect content.</p>
             * 
             * <strong>example:</strong>
             * <p>Containername</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The detection content key corresponds to the display name.</p>
             * 
             * <strong>example:</strong>
             * <p>ContainerName</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * <p>Display type. Value:</p>
             * <ul>
             * <li><strong>grid</strong>: Detection grid</li>
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
