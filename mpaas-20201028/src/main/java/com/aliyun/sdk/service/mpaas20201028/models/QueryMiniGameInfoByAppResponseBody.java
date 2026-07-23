// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link QueryMiniGameInfoByAppResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMiniGameInfoByAppResponseBody</p>
 */
public class QueryMiniGameInfoByAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.List<Content> content;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultMsg")
    private String resultMsg;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryMiniGameInfoByAppResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.content = builder.content;
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMiniGameInfoByAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return content
     */
    public java.util.List<Content> getContent() {
        return this.content;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultMsg
     */
    public String getResultMsg() {
        return this.resultMsg;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List<Content> content; 
        private String errorCode; 
        private String requestId; 
        private String resultMsg; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryMiniGameInfoByAppResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.content = model.content;
            this.errorCode = model.errorCode;
            this.requestId = model.requestId;
            this.resultMsg = model.resultMsg;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(java.util.List<Content> content) {
            this.content = content;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultMsg.
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryMiniGameInfoByAppResponseBody build() {
            return new QueryMiniGameInfoByAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMiniGameInfoByAppResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMiniGameInfoByAppResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GameEngine")
        private String gameEngine;

        @com.aliyun.core.annotation.NameInMap("GameMaker")
        private String gameMaker;

        @com.aliyun.core.annotation.NameInMap("GameTypeLevel1")
        private String gameTypeLevel1;

        @com.aliyun.core.annotation.NameInMap("GameTypeLevel2")
        private String gameTypeLevel2;

        @com.aliyun.core.annotation.NameInMap("GameTypeLevel3")
        private String gameTypeLevel3;

        @com.aliyun.core.annotation.NameInMap("GameVersionId")
        private String gameVersionId;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Introduction")
        private String introduction;

        @com.aliyun.core.annotation.NameInMap("MiniProgramCode")
        private String miniProgramCode;

        @com.aliyun.core.annotation.NameInMap("MiniProgramId")
        private Long miniProgramId;

        @com.aliyun.core.annotation.NameInMap("MiniProgramName")
        private String miniProgramName;

        @com.aliyun.core.annotation.NameInMap("Slogan")
        private String slogan;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Content(Builder builder) {
            this.gameEngine = builder.gameEngine;
            this.gameMaker = builder.gameMaker;
            this.gameTypeLevel1 = builder.gameTypeLevel1;
            this.gameTypeLevel2 = builder.gameTypeLevel2;
            this.gameTypeLevel3 = builder.gameTypeLevel3;
            this.gameVersionId = builder.gameVersionId;
            this.gmtModified = builder.gmtModified;
            this.icon = builder.icon;
            this.introduction = builder.introduction;
            this.miniProgramCode = builder.miniProgramCode;
            this.miniProgramId = builder.miniProgramId;
            this.miniProgramName = builder.miniProgramName;
            this.slogan = builder.slogan;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return gameEngine
         */
        public String getGameEngine() {
            return this.gameEngine;
        }

        /**
         * @return gameMaker
         */
        public String getGameMaker() {
            return this.gameMaker;
        }

        /**
         * @return gameTypeLevel1
         */
        public String getGameTypeLevel1() {
            return this.gameTypeLevel1;
        }

        /**
         * @return gameTypeLevel2
         */
        public String getGameTypeLevel2() {
            return this.gameTypeLevel2;
        }

        /**
         * @return gameTypeLevel3
         */
        public String getGameTypeLevel3() {
            return this.gameTypeLevel3;
        }

        /**
         * @return gameVersionId
         */
        public String getGameVersionId() {
            return this.gameVersionId;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return introduction
         */
        public String getIntroduction() {
            return this.introduction;
        }

        /**
         * @return miniProgramCode
         */
        public String getMiniProgramCode() {
            return this.miniProgramCode;
        }

        /**
         * @return miniProgramId
         */
        public Long getMiniProgramId() {
            return this.miniProgramId;
        }

        /**
         * @return miniProgramName
         */
        public String getMiniProgramName() {
            return this.miniProgramName;
        }

        /**
         * @return slogan
         */
        public String getSlogan() {
            return this.slogan;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String gameEngine; 
            private String gameMaker; 
            private String gameTypeLevel1; 
            private String gameTypeLevel2; 
            private String gameTypeLevel3; 
            private String gameVersionId; 
            private Long gmtModified; 
            private String icon; 
            private String introduction; 
            private String miniProgramCode; 
            private Long miniProgramId; 
            private String miniProgramName; 
            private String slogan; 
            private String version; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.gameEngine = model.gameEngine;
                this.gameMaker = model.gameMaker;
                this.gameTypeLevel1 = model.gameTypeLevel1;
                this.gameTypeLevel2 = model.gameTypeLevel2;
                this.gameTypeLevel3 = model.gameTypeLevel3;
                this.gameVersionId = model.gameVersionId;
                this.gmtModified = model.gmtModified;
                this.icon = model.icon;
                this.introduction = model.introduction;
                this.miniProgramCode = model.miniProgramCode;
                this.miniProgramId = model.miniProgramId;
                this.miniProgramName = model.miniProgramName;
                this.slogan = model.slogan;
                this.version = model.version;
            } 

            /**
             * GameEngine.
             */
            public Builder gameEngine(String gameEngine) {
                this.gameEngine = gameEngine;
                return this;
            }

            /**
             * GameMaker.
             */
            public Builder gameMaker(String gameMaker) {
                this.gameMaker = gameMaker;
                return this;
            }

            /**
             * GameTypeLevel1.
             */
            public Builder gameTypeLevel1(String gameTypeLevel1) {
                this.gameTypeLevel1 = gameTypeLevel1;
                return this;
            }

            /**
             * GameTypeLevel2.
             */
            public Builder gameTypeLevel2(String gameTypeLevel2) {
                this.gameTypeLevel2 = gameTypeLevel2;
                return this;
            }

            /**
             * GameTypeLevel3.
             */
            public Builder gameTypeLevel3(String gameTypeLevel3) {
                this.gameTypeLevel3 = gameTypeLevel3;
                return this;
            }

            /**
             * GameVersionId.
             */
            public Builder gameVersionId(String gameVersionId) {
                this.gameVersionId = gameVersionId;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * Introduction.
             */
            public Builder introduction(String introduction) {
                this.introduction = introduction;
                return this;
            }

            /**
             * MiniProgramCode.
             */
            public Builder miniProgramCode(String miniProgramCode) {
                this.miniProgramCode = miniProgramCode;
                return this;
            }

            /**
             * MiniProgramId.
             */
            public Builder miniProgramId(Long miniProgramId) {
                this.miniProgramId = miniProgramId;
                return this;
            }

            /**
             * MiniProgramName.
             */
            public Builder miniProgramName(String miniProgramName) {
                this.miniProgramName = miniProgramName;
                return this;
            }

            /**
             * Slogan.
             */
            public Builder slogan(String slogan) {
                this.slogan = slogan;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
