// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeDataCheckTableDiffDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataCheckTableDiffDetailsResponseBody</p>
 */
public class DescribeDataCheckTableDiffDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.NameInMap("DiffCount")
    private Long diffCount;

    @com.aliyun.core.annotation.NameInMap("DiffDetails")
    private java.util.List<DiffDetails> diffDetails;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TbName")
    private String tbName;

    private DescribeDataCheckTableDiffDetailsResponseBody(Builder builder) {
        this.dbName = builder.dbName;
        this.diffCount = builder.diffCount;
        this.diffDetails = builder.diffDetails;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tbName = builder.tbName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataCheckTableDiffDetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return diffCount
     */
    public Long getDiffCount() {
        return this.diffCount;
    }

    /**
     * @return diffDetails
     */
    public java.util.List<DiffDetails> getDiffDetails() {
        return this.diffDetails;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return tbName
     */
    public String getTbName() {
        return this.tbName;
    }

    public static final class Builder {
        private String dbName; 
        private Long diffCount; 
        private java.util.List<DiffDetails> diffDetails; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String instanceId; 
        private String requestId; 
        private Boolean success; 
        private String tbName; 

        private Builder() {
        } 

        private Builder(DescribeDataCheckTableDiffDetailsResponseBody model) {
            this.dbName = model.dbName;
            this.diffCount = model.diffCount;
            this.diffDetails = model.diffDetails;
            this.dynamicMessage = model.dynamicMessage;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.instanceId = model.instanceId;
            this.requestId = model.requestId;
            this.success = model.success;
            this.tbName = model.tbName;
        } 

        /**
         * <p>The name of the source database to which the table that contains inconsistent data belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>db_dtstest</p>
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The number of data rows that contain inconsistent data.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder diffCount(Long diffCount) {
            this.diffCount = diffCount;
            return this;
        }

        /**
         * <p>The information about the inconsistent data.</p>
         */
        public Builder diffDetails(java.util.List<DiffDetails> diffDetails) {
            this.diffDetails = diffDetails;
            return this;
        }

        /**
         * <p>The dynamic part in the error message. This parameter is used to replace the **%s** variable in the <strong>ErrMessage</strong> parameter.</p>
         * <blockquote>
         * <p>For example, if the value of the <strong>ErrMessage</strong> parameter is <strong>The Value of Input Parameter %s is not valid</strong> and the value of the <strong>DynamicMessage</strong> parameter is <strong>Type</strong>, the specified <strong>Type</strong> parameter is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Type</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of the parameter tbName is invalid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsog8q1z3tc9t****&quot;</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>621BB4F8-3016-4FAA-8D5A-5D3163CC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The name of the table that contains inconsistent data in the source database.</p>
         * 
         * <strong>example:</strong>
         * <p>test_person</p>
         */
        public Builder tbName(String tbName) {
            this.tbName = tbName;
            return this;
        }

        public DescribeDataCheckTableDiffDetailsResponseBody build() {
            return new DescribeDataCheckTableDiffDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataCheckTableDiffDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataCheckTableDiffDetailsResponseBody</p>
     */
    public static class DiffDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Diff")
        private String diff;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        private DiffDetails(Builder builder) {
            this.diff = builder.diff;
            this.gmtCreated = builder.gmtCreated;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiffDetails create() {
            return builder().build();
        }

        /**
         * @return diff
         */
        public String getDiff() {
            return this.diff;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private String diff; 
            private String gmtCreated; 
            private Long id; 

            private Builder() {
            } 

            private Builder(DiffDetails model) {
                this.diff = model.diff;
                this.gmtCreated = model.gmtCreated;
                this.id = model.id;
            } 

            /**
             * <p>The details of the inconsistent data, whose value is a JSON string. The JSON string contains the following parameters:</p>
             * <ul>
             * <li>column: the name of the field.</li>
             * <li>source: the value of the field in the source database.</li>
             * <li>dest: the value of the field in the destination database.</li>
             * <li>isPrimary: indicates whether the field is a primary key.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[     {         &quot;column&quot;: &quot;id&quot;,         &quot;source&quot;: &quot;9511&quot;,         &quot;dest&quot;: &quot;9511&quot;,         &quot;isPrimary&quot;: true     },     {         &quot;column&quot;: &quot;state&quot;,         &quot;source&quot;: &quot;3&quot;,         &quot;dest&quot;: &quot;2&quot;,         &quot;isPrimary&quot;: false     },     {         &quot;column&quot;: &quot;create_time&quot;,         &quot;source&quot;: &quot;2023-04-11 14:07:17.0&quot;,         &quot;dest&quot;: &quot;NULL&quot;,         &quot;isPrimary&quot;: false     },     {         &quot;column&quot;: &quot;update_time&quot;,         &quot;source&quot;: &quot;2023-04-11 06:07:17.0&quot;,         &quot;dest&quot;: &quot;2023-04-11 06:02:29.0&quot;,         &quot;isPrimary&quot;: false     } ]</p>
             */
            public Builder diff(String diff) {
                this.diff = diff;
                return this;
            }

            /**
             * <p>The time when the data verification was performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-23T10:36:05.000+00:00</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The auto-increment primary key that is used to identify the data in a verification result.</p>
             * 
             * <strong>example:</strong>
             * <p>13058****</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public DiffDetails build() {
                return new DiffDetails(this);
            } 

        } 

    }
}
