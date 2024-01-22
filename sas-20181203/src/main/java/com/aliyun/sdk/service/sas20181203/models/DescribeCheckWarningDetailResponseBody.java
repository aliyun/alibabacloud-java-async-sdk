// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCheckWarningDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCheckWarningDetailResponseBody</p>
 */
public class DescribeCheckWarningDetailResponseBody extends TeaModel {
    @NameInMap("Advice")
    private String advice;

    @NameInMap("CheckDetailAssetInfo")
    private java.util.List < java.util.Map<String, String>> checkDetailAssetInfo;

    @NameInMap("CheckDetailColumns")
    private java.util.List < CheckDetailColumns> checkDetailColumns;

    @NameInMap("CheckId")
    private Long checkId;

    @NameInMap("Description")
    private String description;

    @NameInMap("Item")
    private String item;

    @NameInMap("Level")
    private String level;

    @NameInMap("Prompt")
    private String prompt;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Type")
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
    public java.util.List < java.util.Map<String, String>> getCheckDetailAssetInfo() {
        return this.checkDetailAssetInfo;
    }

    /**
     * @return checkDetailColumns
     */
    public java.util.List < CheckDetailColumns> getCheckDetailColumns() {
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
        private java.util.List < java.util.Map<String, String>> checkDetailAssetInfo; 
        private java.util.List < CheckDetailColumns> checkDetailColumns; 
        private Long checkId; 
        private String description; 
        private String item; 
        private String level; 
        private String prompt; 
        private String requestId; 
        private String type; 

        /**
         * The suggestion for the management of the risk item.
         */
        public Builder advice(String advice) {
            this.advice = advice;
            return this;
        }

        /**
         * List of asset details to check.
         */
        public Builder checkDetailAssetInfo(java.util.List < java.util.Map<String, String>> checkDetailAssetInfo) {
            this.checkDetailAssetInfo = checkDetailAssetInfo;
            return this;
        }

        /**
         * Detection content details.
         */
        public Builder checkDetailColumns(java.util.List < CheckDetailColumns> checkDetailColumns) {
            this.checkDetailColumns = checkDetailColumns;
            return this;
        }

        /**
         * The ID of the check item.
         */
        public Builder checkId(Long checkId) {
            this.checkId = checkId;
            return this;
        }

        /**
         * The additional information about the risk item.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The name of the check item.
         */
        public Builder item(String item) {
            this.item = item;
            return this;
        }

        /**
         * The risk level of the check item. Valid values:
         * <p>
         * 
         * *   **high**: The item is a high-risk item and is highlighted in red.
         * *   **medium**: The item is a medium-risk item and is highlighted in orange.
         * *   **low**: The item is a low-risk item and is highlighted in gray.
         */
        public Builder level(String level) {
            this.level = level;
            return this;
        }

        /**
         * The prompt for the risk item.
         */
        public Builder prompt(String prompt) {
            this.prompt = prompt;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The type of the check item. Valid values:
         * <p>
         * 
         * *   **hc_exploit**: unauthorized access
         * *   **hc_djbh**: classified protection compliance
         * *   **hc_best_secruity**: best security practice
         * *   **hc_container**: container security
         * *   **hc_custom**: custom baseline
         * *   **cis**: Center for Internet Security (CIS) compliance
         * *   **weak_password**: weak password
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeCheckWarningDetailResponseBody build() {
            return new DescribeCheckWarningDetailResponseBody(this);
        } 

    } 

    public static class Grids extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("ShowName")
        private String showName;

        @NameInMap("Type")
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
             * Key to detect content.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The detection content key corresponds to the display name.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * Display type. Value:
             * <p>
             * - **grid**: Detection grid
             * - **text**: text
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
    public static class CheckDetailColumns extends TeaModel {
        @NameInMap("Grids")
        private java.util.List < Grids> grids;

        @NameInMap("Key")
        private String key;

        @NameInMap("ShowName")
        private String showName;

        @NameInMap("Type")
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
        public java.util.List < Grids> getGrids() {
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
            private java.util.List < Grids> grids; 
            private String key; 
            private String showName; 
            private String type; 

            /**
             * Detection content list.
             */
            public Builder grids(java.util.List < Grids> grids) {
                this.grids = grids;
                return this;
            }

            /**
             * Key to detect content.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The detection content key corresponds to the display name.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * Display type. Value:
             * <p>
             * - **grid**: Detection grid
             * - **text**: text
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
