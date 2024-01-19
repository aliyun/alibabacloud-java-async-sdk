// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetActivityGameInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetActivityGameInfoResponseBody</p>
 */
public class GetActivityGameInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private Model model;

    @NameInMap("RequestId")
    private String requestId;

    private GetActivityGameInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetActivityGameInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Model model; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetActivityGameInfoResponseBody build() {
            return new GetActivityGameInfoResponseBody(this);
        } 

    } 

    public static class Model extends TeaModel {
        @NameInMap("ExtInfo")
        private String extInfo;

        @NameInMap("GameDTO")
        private String gameDTO;

        @NameInMap("GameShowInfo")
        private String gameShowInfo;

        @NameInMap("UserGameCoinInfos")
        private String userGameCoinInfos;

        @NameInMap("UserProcessDTO")
        private String userProcessDTO;

        private Model(Builder builder) {
            this.extInfo = builder.extInfo;
            this.gameDTO = builder.gameDTO;
            this.gameShowInfo = builder.gameShowInfo;
            this.userGameCoinInfos = builder.userGameCoinInfos;
            this.userProcessDTO = builder.userProcessDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return extInfo
         */
        public String getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return gameDTO
         */
        public String getGameDTO() {
            return this.gameDTO;
        }

        /**
         * @return gameShowInfo
         */
        public String getGameShowInfo() {
            return this.gameShowInfo;
        }

        /**
         * @return userGameCoinInfos
         */
        public String getUserGameCoinInfos() {
            return this.userGameCoinInfos;
        }

        /**
         * @return userProcessDTO
         */
        public String getUserProcessDTO() {
            return this.userProcessDTO;
        }

        public static final class Builder {
            private String extInfo; 
            private String gameDTO; 
            private String gameShowInfo; 
            private String userGameCoinInfos; 
            private String userProcessDTO; 

            /**
             * ExtInfo.
             */
            public Builder extInfo(String extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * GameDTO.
             */
            public Builder gameDTO(String gameDTO) {
                this.gameDTO = gameDTO;
                return this;
            }

            /**
             * GameShowInfo.
             */
            public Builder gameShowInfo(String gameShowInfo) {
                this.gameShowInfo = gameShowInfo;
                return this;
            }

            /**
             * UserGameCoinInfos.
             */
            public Builder userGameCoinInfos(String userGameCoinInfos) {
                this.userGameCoinInfos = userGameCoinInfos;
                return this;
            }

            /**
             * UserProcessDTO.
             */
            public Builder userProcessDTO(String userProcessDTO) {
                this.userProcessDTO = userProcessDTO;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
