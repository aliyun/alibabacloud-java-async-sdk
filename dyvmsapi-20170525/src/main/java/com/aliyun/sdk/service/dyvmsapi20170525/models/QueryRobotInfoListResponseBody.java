// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryRobotInfoListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRobotInfoListResponseBody</p>
 */
public class QueryRobotInfoListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryRobotInfoListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRobotInfoListResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String code; 
        private String data; 
        private String message; 
        private String requestId; 

        /**
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The basic information about the robot, in the JSON format. The basic information contains the following parameters:</p>
         * <ul>
         * <li><strong>id</strong>: the robot ID.</li>
         * <li><strong>robotName</strong>: the robot name.</li>
         * <li><strong>robotType</strong>: the robot type.</li>
         * <li><strong>auditStatus</strong>: the review state.</li>
         * <li><strong>gmtCreate</strong>: the time when the task was created.</li>
         * <li><strong>gmtModified</strong>: the time when the task was modified.</li>
         * <li><strong>partnerId</strong>: the partner ID.</li>
         * <li><strong>asrId</strong>: the ID of the automatic speech recognition (ASR) model.</li>
         * <li><strong>asrType</strong>: the ASR type. Valid values: <strong>Public</strong> and <strong>Private</strong>.</li>
         * <li><strong>remark</strong>: the additional information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{[&quot;id&quot;:1000010920004, &quot;gmtModified&quot;:&quot;Thu Mar 21 15:38:55 CST 2019&quot;, &quot;auditStatus&quot;:&quot;AUDITPASS&quot;,&quot;gmtCreate&quot;:&quot;Thu Mar 21 12:00:51 CST 2019&quot;,&quot;remark&quot;:&quot;tset&quot;,&quot;partnerId&quot;:100000022670001,&quot;asrId&quot;:&quot;a9a1d69081fd4266ad788346bf5e1b6c&quot;,&quot;robotType&quot;:&quot;CUSTOM&quot;,&quot;asrType&quot;:&quot;1&quot;,&quot;robotName&quot;:&quot;Collection scenario&quot;},{&quot;id&quot;:1000010920003,&quot;gmtModified&quot;:&quot;Thu Mar 21 11:51:10 CST 2019&quot;,&quot;auditStatus&quot;:&quot;AUDITPASS&quot;,&quot;gmtCreate&quot;:&quot;Thu Mar 21 11:44:57 CST 2019&quot;,&quot;remark&quot;:&quot;test&quot;,&quot;partnerId&quot;:100000022670001,&quot;asrId&quot;:&quot;a9a1d69081fd4266ad788346bf5e1b6c&quot;,&quot;robotType&quot;:&quot;CUSTOM&quot;,&quot;asrType&quot;:&quot;1&quot;,&quot;robotName&quot;:&quot;Collection scenario&quot;]}</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F59AF338-655D-48E8-9471-5EB07692B1CC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryRobotInfoListResponseBody build() {
            return new QueryRobotInfoListResponseBody(this);
        } 

    } 

}
