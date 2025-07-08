// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QueryCardSmsStatisticsListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCardSmsStatisticsListResponseBody</p>
 */
public class QueryCardSmsStatisticsListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Model")
    private java.util.List<Model> model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryCardSmsStatisticsListResponseBody(Builder builder) {
        this.code = builder.code;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCardSmsStatisticsListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return model
     */
    public java.util.List<Model> getModel() {
        return this.model;
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

    public static final class Builder {
        private String code; 
        private java.util.List<Model> model; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryCardSmsStatisticsListResponseBody model) {
            this.code = model.code;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(java.util.List<Model> model) {
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCardSmsStatisticsListResponseBody build() {
            return new QueryCardSmsStatisticsListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCardSmsStatisticsListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCardSmsStatisticsListResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RenderSuccessTotal")
        private Long renderSuccessTotal;

        @com.aliyun.core.annotation.NameInMap("SendDate")
        private String sendDate;

        @com.aliyun.core.annotation.NameInMap("UrlGenerateTotal")
        private Long urlGenerateTotal;

        private Model(Builder builder) {
            this.renderSuccessTotal = builder.renderSuccessTotal;
            this.sendDate = builder.sendDate;
            this.urlGenerateTotal = builder.urlGenerateTotal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return renderSuccessTotal
         */
        public Long getRenderSuccessTotal() {
            return this.renderSuccessTotal;
        }

        /**
         * @return sendDate
         */
        public String getSendDate() {
            return this.sendDate;
        }

        /**
         * @return urlGenerateTotal
         */
        public Long getUrlGenerateTotal() {
            return this.urlGenerateTotal;
        }

        public static final class Builder {
            private Long renderSuccessTotal; 
            private String sendDate; 
            private Long urlGenerateTotal; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.renderSuccessTotal = model.renderSuccessTotal;
                this.sendDate = model.sendDate;
                this.urlGenerateTotal = model.urlGenerateTotal;
            } 

            /**
             * RenderSuccessTotal.
             */
            public Builder renderSuccessTotal(Long renderSuccessTotal) {
                this.renderSuccessTotal = renderSuccessTotal;
                return this;
            }

            /**
             * SendDate.
             */
            public Builder sendDate(String sendDate) {
                this.sendDate = sendDate;
                return this;
            }

            /**
             * UrlGenerateTotal.
             */
            public Builder urlGenerateTotal(Long urlGenerateTotal) {
                this.urlGenerateTotal = urlGenerateTotal;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
