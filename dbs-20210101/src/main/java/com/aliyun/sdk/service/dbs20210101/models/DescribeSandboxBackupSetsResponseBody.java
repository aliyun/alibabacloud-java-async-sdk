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
 * {@link DescribeSandboxBackupSetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSandboxBackupSetsResponseBody</p>
 */
public class DescribeSandboxBackupSetsResponseBody extends TeaModel {
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

    private DescribeSandboxBackupSetsResponseBody(Builder builder) {
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

    public static DescribeSandboxBackupSetsResponseBody create() {
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

        private Builder(DescribeSandboxBackupSetsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Param.NotFound</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data. The following parameters are contained:</p>
         * <ul>
         * <li><strong>backupSetTime</strong>: the point in time when the snapshot was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</li>
         * <li><strong>backupSetId</strong>: the ID of the backup set.</li>
         * <li><strong>backupSetType</strong>: the type of the snapshot. A value of <strong>Full</strong> indicates that the snapshot is a full backup snapshot. A value of <strong>Inc</strong> indicates that the snapshot is an incremental backup snapshot.</li>
         * <li><strong>backupPlanId</strong>: the ID of the backup schedule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;Data&quot;: {     &quot;number&quot;: 2,     &quot;size&quot;: 2,     &quot;content&quot;: [       {         &quot;backupSetTime&quot;: &quot;2021-08-28T23:12:31Z&quot;,         &quot;backupSetId&quot;: &quot;Inc_1hxxxx8xxxxxa_20210801064200_mysql-bin.000134&quot;,         &quot;backupSetType&quot;: &quot;Inc&quot;,         &quot;backupPlanId&quot;: &quot;1hxxxx8xxxxxa&quot;       },       {         &quot;backupSetTime&quot;: &quot;2021-08-28T22:42:28Z&quot;,         &quot;backupSetId&quot;: &quot;1hxxxx8xxxxxa_20210829064228&quot;,         &quot;backupSetType&quot;: &quot;FULL&quot;,         &quot;backupPlanId&quot;: &quot;1hxxxx8xxxxxa&quot;       }     ],     &quot;totalElements&quot;: 2   },</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Param.NotFound</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter %s value is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
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

        public DescribeSandboxBackupSetsResponseBody build() {
            return new DescribeSandboxBackupSetsResponseBody(this);
        } 

    } 

}
