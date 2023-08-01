// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPerspectivesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPerspectivesResponseBody</p>
 */
public class QueryPerspectivesResponseBody extends TeaModel {
    @NameInMap("Perspectives")
    private java.util.List < Perspectives> perspectives;

    @NameInMap("RequestId")
    private String requestId;

    private QueryPerspectivesResponseBody(Builder builder) {
        this.perspectives = builder.perspectives;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPerspectivesResponseBody create() {
        return builder().build();
    }

    /**
     * @return perspectives
     */
    public java.util.List < Perspectives> getPerspectives() {
        return this.perspectives;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Perspectives> perspectives; 
        private String requestId; 

        /**
         * Perspectives.
         */
        public Builder perspectives(java.util.List < Perspectives> perspectives) {
            this.perspectives = perspectives;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryPerspectivesResponseBody build() {
            return new QueryPerspectivesResponseBody(this);
        } 

    } 

    public static class Perspectives extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("PerspectiveCode")
        private String perspectiveCode;

        @NameInMap("PerspectiveId")
        private String perspectiveId;

        @NameInMap("SelfDefine")
        private Boolean selfDefine;

        @NameInMap("Status")
        private Integer status;

        private Perspectives(Builder builder) {
            this.createTime = builder.createTime;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.perspectiveCode = builder.perspectiveCode;
            this.perspectiveId = builder.perspectiveId;
            this.selfDefine = builder.selfDefine;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Perspectives create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return perspectiveCode
         */
        public String getPerspectiveCode() {
            return this.perspectiveCode;
        }

        /**
         * @return perspectiveId
         */
        public String getPerspectiveId() {
            return this.perspectiveId;
        }

        /**
         * @return selfDefine
         */
        public Boolean getSelfDefine() {
            return this.selfDefine;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String modifyTime; 
            private String name; 
            private String perspectiveCode; 
            private String perspectiveId; 
            private Boolean selfDefine; 
            private Integer status; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PerspectiveCode.
             */
            public Builder perspectiveCode(String perspectiveCode) {
                this.perspectiveCode = perspectiveCode;
                return this;
            }

            /**
             * PerspectiveId.
             */
            public Builder perspectiveId(String perspectiveId) {
                this.perspectiveId = perspectiveId;
                return this;
            }

            /**
             * SelfDefine.
             */
            public Builder selfDefine(Boolean selfDefine) {
                this.selfDefine = selfDefine;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Perspectives build() {
                return new Perspectives(this);
            } 

        } 

    }
}
