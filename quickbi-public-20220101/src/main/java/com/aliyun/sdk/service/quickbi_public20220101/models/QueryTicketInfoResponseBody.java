// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryTicketInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTicketInfoResponseBody</p>
 */
public class QueryTicketInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryTicketInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTicketInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryTicketInfoResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the generated ticket.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryTicketInfoResponseBody build() {
            return new QueryTicketInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTicketInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTicketInfoResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessTicket")
        private String accessTicket;

        @com.aliyun.core.annotation.NameInMap("CmptId")
        private String cmptId;

        @com.aliyun.core.annotation.NameInMap("GlobalParam")
        private String globalParam;

        @com.aliyun.core.annotation.NameInMap("InvalidTime")
        private String invalidTime;

        @com.aliyun.core.annotation.NameInMap("MaxTicketNum")
        private Integer maxTicketNum;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("RegisterTime")
        private String registerTime;

        @com.aliyun.core.annotation.NameInMap("UsedTicketNum")
        private Integer usedTicketNum;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("WatermarkParam")
        private String watermarkParam;

        @com.aliyun.core.annotation.NameInMap("WorksId")
        private String worksId;

        private Result(Builder builder) {
            this.accessTicket = builder.accessTicket;
            this.cmptId = builder.cmptId;
            this.globalParam = builder.globalParam;
            this.invalidTime = builder.invalidTime;
            this.maxTicketNum = builder.maxTicketNum;
            this.organizationId = builder.organizationId;
            this.registerTime = builder.registerTime;
            this.usedTicketNum = builder.usedTicketNum;
            this.userId = builder.userId;
            this.watermarkParam = builder.watermarkParam;
            this.worksId = builder.worksId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return accessTicket
         */
        public String getAccessTicket() {
            return this.accessTicket;
        }

        /**
         * @return cmptId
         */
        public String getCmptId() {
            return this.cmptId;
        }

        /**
         * @return globalParam
         */
        public String getGlobalParam() {
            return this.globalParam;
        }

        /**
         * @return invalidTime
         */
        public String getInvalidTime() {
            return this.invalidTime;
        }

        /**
         * @return maxTicketNum
         */
        public Integer getMaxTicketNum() {
            return this.maxTicketNum;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return registerTime
         */
        public String getRegisterTime() {
            return this.registerTime;
        }

        /**
         * @return usedTicketNum
         */
        public Integer getUsedTicketNum() {
            return this.usedTicketNum;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return watermarkParam
         */
        public String getWatermarkParam() {
            return this.watermarkParam;
        }

        /**
         * @return worksId
         */
        public String getWorksId() {
            return this.worksId;
        }

        public static final class Builder {
            private String accessTicket; 
            private String cmptId; 
            private String globalParam; 
            private String invalidTime; 
            private Integer maxTicketNum; 
            private String organizationId; 
            private String registerTime; 
            private Integer usedTicketNum; 
            private String userId; 
            private String watermarkParam; 
            private String worksId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.accessTicket = model.accessTicket;
                this.cmptId = model.cmptId;
                this.globalParam = model.globalParam;
                this.invalidTime = model.invalidTime;
                this.maxTicketNum = model.maxTicketNum;
                this.organizationId = model.organizationId;
                this.registerTime = model.registerTime;
                this.usedTicketNum = model.usedTicketNum;
                this.userId = model.userId;
                this.watermarkParam = model.watermarkParam;
                this.worksId = model.worksId;
            } 

            /**
             * <p>Notes.</p>
             * 
             * <strong>example:</strong>
             * <p>a27a9aec-<strong><strong>-</strong></strong>-bd40-1a21ea41d7c5</p>
             */
            public Builder accessTicket(String accessTicket) {
                this.accessTicket = accessTicket;
                return this;
            }

            /**
             * <p>The ID of the component in the report.</p>
             * 
             * <strong>example:</strong>
             * <p>sfdgsds-<strong><strong>-</strong></strong>-a608-mghdgd</p>
             */
            public Builder cmptId(String cmptId) {
                this.cmptId = cmptId;
                return this;
            }

            /**
             * <p>Global parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>[&amp;{quot;paramKey&amp;quot;:&amp;quot;price&amp;quot;,&amp;quot;joinType&amp;quot;and&amp;quot;,&amp;quot;conditionList&amp;quot;:[{&amp;quot; operation&amp;quot;&amp;quot;&amp;quot;&amp;quot;&amp;quot;&amp;quot;&amp;quot;value ;&amp; quot;&amp;quot;&amp;quot;&amp;quot;&amp;quot;&amp;quot;&amp;quot;&amp;quot;&amp;quot;&amp;quot product_type&amp;quot;,&amp;quot;joinType&amp;quot;:&amp;quot;and &quot;;,&amp; quot;conditionList&amp;quot;, the conditions must be:[{&amp;quot;operate&quot; ;:&amp; quot;in&amp;quot;,&amp;quot;value&amp;quot;, the conditions must be:[&amp;quot; office supplies&amp;quot;,&amp;quot; furniture products&amp;quot;]}]}]\n</p>
             */
            public Builder globalParam(String globalParam) {
                this.globalParam = globalParam;
                return this;
            }

            /**
             * <p>Expiration time of the note.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-30 03:03:49</p>
             */
            public Builder invalidTime(String invalidTime) {
                this.invalidTime = invalidTime;
                return this;
            }

            /**
             * <p>The maximum number of supported bills.</p>
             * 
             * <strong>example:</strong>
             * <p>9999</p>
             */
            public Builder maxTicketNum(Integer maxTicketNum) {
                this.maxTicketNum = maxTicketNum;
                return this;
            }

            /**
             * <p>The ID of the organization.</p>
             * 
             * <strong>example:</strong>
             * <p>2fe4fbd8-<strong><strong>-</strong></strong>-b3e1-e92c7af083ea</p>
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * <p>The registration time of the ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-09 22:23:49</p>
             */
            public Builder registerTime(String registerTime) {
                this.registerTime = registerTime;
                return this;
            }

            /**
             * <p>The number of bills that have been consumed.</p>
             * 
             * <strong>example:</strong>
             * <p>47</p>
             */
            public Builder usedTicketNum(Integer usedTicketNum) {
                this.usedTicketNum = usedTicketNum;
                return this;
            }

            /**
             * <p>The user ID of the Quick BI.</p>
             * 
             * <strong>example:</strong>
             * <p>974e50**********9033f46</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Set the watermarking parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>Tripartite embedding of Ticket</p>
             */
            public Builder watermarkParam(String watermarkParam) {
                this.watermarkParam = watermarkParam;
                return this;
            }

            /**
             * <p>The ID of the operations report.</p>
             * 
             * <strong>example:</strong>
             * <p>ccd3428c-<strong><strong>-</strong></strong>-a608-26bae29dffee</p>
             */
            public Builder worksId(String worksId) {
                this.worksId = worksId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
