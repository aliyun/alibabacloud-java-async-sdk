// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link QueryPerspectivesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPerspectivesResponseBody</p>
 */
public class QueryPerspectivesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Perspectives")
    private java.util.List<Perspectives> perspectives;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return perspectives
     */
    public java.util.List<Perspectives> getPerspectives() {
        return this.perspectives;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Perspectives> perspectives; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryPerspectivesResponseBody model) {
            this.perspectives = model.perspectives;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of perspectives.</p>
         */
        public Builder perspectives(java.util.List<Perspectives> perspectives) {
            this.perspectives = perspectives;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F285D735-D580-18A8-B97F-B2E72B00F101</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryPerspectivesResponseBody build() {
            return new QueryPerspectivesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPerspectivesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPerspectivesResponseBody</p>
     */
    public static class Perspectives extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PerspectiveCode")
        private String perspectiveCode;

        @com.aliyun.core.annotation.NameInMap("PerspectiveId")
        private String perspectiveId;

        @com.aliyun.core.annotation.NameInMap("SelfDefine")
        private Boolean selfDefine;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(Perspectives model) {
                this.createTime = model.createTime;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.perspectiveCode = model.perspectiveCode;
                this.perspectiveId = model.perspectiveId;
                this.selfDefine = model.selfDefine;
                this.status = model.status;
            } 

            /**
             * <p>The creation time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-12T06:30:17Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The modification time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-29T03:38:54Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The perspective name.</p>
             * 
             * <strong>example:</strong>
             * <p>Mobile perspective</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The perspective code, which is used for the Q&amp;A API.</p>
             * 
             * <strong>example:</strong>
             * <p>FZJBY3raWr</p>
             */
            public Builder perspectiveCode(String perspectiveCode) {
                this.perspectiveCode = perspectiveCode;
                return this;
            }

            /**
             * <p>The perspective ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3001</p>
             */
            public Builder perspectiveId(String perspectiveId) {
                this.perspectiveId = perspectiveId;
                return this;
            }

            /**
             * <p>Indicates whether the perspective is custom-defined.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder selfDefine(Boolean selfDefine) {
                this.selfDefine = selfDefine;
                return this;
            }

            /**
             * <p>The data status. Valid values:</p>
             * <ul>
             * <li>3: Enabled.</li>
             * <li>1: Not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
