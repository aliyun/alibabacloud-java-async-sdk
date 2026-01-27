// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

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
 * {@link DescribeSandboxInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSandboxInstancesResponseBody</p>
 */
public class DescribeSandboxInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeSandboxInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSandboxInstancesResponseBody create() {
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
     * @return data
     */
    public String getData() {
        return this.data;
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
     * @return message
     */
    public String getMessage() {
        return this.message;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String data; 
        private String errCode; 
        private String errMessage; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeSandboxInstancesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Param.NotFound</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         * <ul>
         * <li><strong>connectionString</strong>: the connection string of the sandbox instance, in the format of IP address:Port number. This parameter indicates the endpoint of the sandbox instance if the value of the SandboxType parameter is <strong>Sandbox</strong>. This parameter indicates the Network File System (NFS) mount address if the value of the SandboxType parameter is <strong>NFS</strong>.</li>
         * <li><strong>restoreSeconds</strong>: the time required to create the sandbox instance. Unit: seconds.</li>
         * <li><strong>restoreTime</strong>: the point in time to which the sandbox instance is restored. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</li>
         * <li><strong>instanceId</strong>: the ID of the sandbox instance.</li>
         * <li><strong>backupSetId</strong>: the ID of the backup set.</li>
         * <li><strong>createTime</strong>: the point in time when the sandbox instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</li>
         * <li><strong>backupPlanId</strong>: the ID of the backup schedule.</li>
         * <li><strong>vpcId</strong>: the ID of the virtual private cloud (VPC).</li>
         * <li><strong>vpcSwitchId</strong>: the ID of the VSwitch.</li>
         * <li><strong>sandboxSpecification</strong>: the specifications of the sandbox instance.</li>
         * <li><strong>status</strong>: the status of the sandbox instance. Valid values: <strong>running</strong>, <strong>check_pass</strong>, and <strong>stop</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;number&quot;: 1,     &quot;size&quot;: 1,     &quot;content&quot;: [       {         &quot;connectionString&quot;: &quot;172.26.178.229:3306&quot;,         &quot;restoreSeconds&quot;: 15,         &quot;restoreTime&quot;: &quot;2021-08-11T07:26:24Z&quot;,         &quot;instanceId&quot;: &quot;1jxxxxx9xxxms&quot;,         &quot;backupSetId&quot;: &quot;1hxxxx8xxxxxa_20210811152624&quot;,         &quot;createTime&quot;: &quot;2021-08-12T07:40:29Z&quot;,         &quot;backupPlanId&quot;: &quot;1hxxxx8xxxxxa&quot;,         &quot;vpcId&quot;: &quot;vpc-bp1dxxxxxjy0xxxxx1xxp&quot;,         &quot;sandboxSpecification&quot;: &quot;MYSQL_1C_1M_SD&quot;,         &quot;status&quot;: &quot;running&quot;,         &quot;vpcSwitchId&quot;: &quot;vsw-bp1bxxxxxumxxxxxwxx2w&quot;       }     ],     &quot;totalElements&quot;: 1   }</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Param.NotFound</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter %s value is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter %s value is not valid.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4F1888AC-1138-4995-B9FE-D2734F61C058</p>
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSandboxInstancesResponseBody build() {
            return new DescribeSandboxInstancesResponseBody(this);
        } 

    } 

}
