// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link ListAgentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentsResponseBody</p>
 */
public class ListAgentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("list")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListAgentsResponseBody(Builder builder) {
        this.list = builder.list;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<List> list; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListAgentsResponseBody model) {
            this.list = model.list;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * list.
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListAgentsResponseBody build() {
            return new ListAgentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("agentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("agentScene")
        private String agentScene;

        @com.aliyun.core.annotation.NameInMap("charactersDescription")
        private String charactersDescription;

        @com.aliyun.core.annotation.NameInMap("enableInteraction")
        private Integer enableInteraction;

        @com.aliyun.core.annotation.NameInMap("industry")
        private String industry;

        @com.aliyun.core.annotation.NameInMap("onlineSearch")
        private Boolean onlineSearch;

        @com.aliyun.core.annotation.NameInMap("owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("referenceUrl")
        private String referenceUrl;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("textStyle")
        private String textStyle;

        @com.aliyun.core.annotation.NameInMap("viewer")
        private String viewer;

        private List(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.agentScene = builder.agentScene;
            this.charactersDescription = builder.charactersDescription;
            this.enableInteraction = builder.enableInteraction;
            this.industry = builder.industry;
            this.onlineSearch = builder.onlineSearch;
            this.owner = builder.owner;
            this.referenceUrl = builder.referenceUrl;
            this.status = builder.status;
            this.textStyle = builder.textStyle;
            this.viewer = builder.viewer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return agentScene
         */
        public String getAgentScene() {
            return this.agentScene;
        }

        /**
         * @return charactersDescription
         */
        public String getCharactersDescription() {
            return this.charactersDescription;
        }

        /**
         * @return enableInteraction
         */
        public Integer getEnableInteraction() {
            return this.enableInteraction;
        }

        /**
         * @return industry
         */
        public String getIndustry() {
            return this.industry;
        }

        /**
         * @return onlineSearch
         */
        public Boolean getOnlineSearch() {
            return this.onlineSearch;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return referenceUrl
         */
        public String getReferenceUrl() {
            return this.referenceUrl;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return textStyle
         */
        public String getTextStyle() {
            return this.textStyle;
        }

        /**
         * @return viewer
         */
        public String getViewer() {
            return this.viewer;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 
            private String agentScene; 
            private String charactersDescription; 
            private Integer enableInteraction; 
            private String industry; 
            private Boolean onlineSearch; 
            private String owner; 
            private String referenceUrl; 
            private Integer status; 
            private String textStyle; 
            private String viewer; 

            private Builder() {
            } 

            private Builder(List model) {
                this.agentId = model.agentId;
                this.agentName = model.agentName;
                this.agentScene = model.agentScene;
                this.charactersDescription = model.charactersDescription;
                this.enableInteraction = model.enableInteraction;
                this.industry = model.industry;
                this.onlineSearch = model.onlineSearch;
                this.owner = model.owner;
                this.referenceUrl = model.referenceUrl;
                this.status = model.status;
                this.textStyle = model.textStyle;
                this.viewer = model.viewer;
            } 

            /**
             * agentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * agentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * agentScene.
             */
            public Builder agentScene(String agentScene) {
                this.agentScene = agentScene;
                return this;
            }

            /**
             * charactersDescription.
             */
            public Builder charactersDescription(String charactersDescription) {
                this.charactersDescription = charactersDescription;
                return this;
            }

            /**
             * enableInteraction.
             */
            public Builder enableInteraction(Integer enableInteraction) {
                this.enableInteraction = enableInteraction;
                return this;
            }

            /**
             * industry.
             */
            public Builder industry(String industry) {
                this.industry = industry;
                return this;
            }

            /**
             * onlineSearch.
             */
            public Builder onlineSearch(Boolean onlineSearch) {
                this.onlineSearch = onlineSearch;
                return this;
            }

            /**
             * owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * referenceUrl.
             */
            public Builder referenceUrl(String referenceUrl) {
                this.referenceUrl = referenceUrl;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * textStyle.
             */
            public Builder textStyle(String textStyle) {
                this.textStyle = textStyle;
                return this;
            }

            /**
             * viewer.
             */
            public Builder viewer(String viewer) {
                this.viewer = viewer;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
