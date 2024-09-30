// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetConfigRuleReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetConfigRuleReportResponseBody</p>
 */
public class GetConfigRuleReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetConfigRuleReportResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigRuleReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The basic information of the resource non-compliance report that is last generated.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A68BD5BC-5B12-5A9B-8AE9-77884886BE10</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request is successful.</li>
         * <li>false: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetConfigRuleReportResponseBody build() {
            return new GetConfigRuleReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConfigRuleReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetConfigRuleReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("ReportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private Data(Builder builder) {
            this.createdTime = builder.createdTime;
            this.reportId = builder.reportId;
            this.targetId = builder.targetId;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private Long createdTime; 
            private String reportId; 
            private String targetId; 
            private String targetType; 

            /**
             * <p>The time when the report was generated. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1655089159000</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The ID of the report.</p>
             * 
             * <strong>example:</strong>
             * <p>crp-ao0786618088006c****</p>
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * <p>The ID of the object.</p>
             * <blockquote>
             * <p> This parameter is returned if you set the <code>TargetType</code> and <code>TargetId</code> parameters in the current request to the same values as the parameters that are configured when you call the <a href="~~433313~~">GenerateConfigRuleReport</a> operation to generate the report.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>154950938137****</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The type of the object. Valid values:</p>
             * <ul>
             * <li>USER: the current logon account. This value is available if you use the Tag Policy feature in single-account mode.</li>
             * <li>ROOT: the Root folder in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
             * <li>FOLDER: a folder other than the Root folder in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
             * <li>ACCOUNT: a member in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned if you set the <code>TargetType</code> and <code>TargetId</code> parameters in the current request to the same values as the parameters that are configured when you call the <a href="~~433313~~">GenerateConfigRuleReport</a> operation to generate the report.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ACCOUNT</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
