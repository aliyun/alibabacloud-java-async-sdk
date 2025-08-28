// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link QueryRobotTaskCallDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRobotTaskCallDetailResponseBody</p>
 */
public class QueryRobotTaskCallDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryRobotTaskCallDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRobotTaskCallDetailResponseBody create() {
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

        private Builder() {
        } 

        private Builder(QueryRobotTaskCallDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

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
         * <p>The call details of a robocall task, in the JSON format.</p>
         * <ul>
         * <li><strong>taskId</strong>: the unique ID of the robocall task.</li>
         * <li><strong>caller</strong>: the calling number.</li>
         * <li><strong>called</strong>: the called number.</li>
         * <li><strong>duration</strong>: the call duration. Unit: seconds.</li>
         * <li><strong>label</strong>: the label of the called party.</li>
         * <li><strong>dialogCount</strong>: the number of conversation rounds in the call.</li>
         * <li><strong>callResult</strong>: the call result.</li>
         * <li><strong>hangupDirection</strong>: the party who hung up. Valid values: <strong>0</strong>: the robot. <strong>1</strong>: the called party.</li>
         * <li><strong>transferResult</strong>: the result of transferring the call to an agent. Valid values: <strong>1</strong>, <strong>0</strong>, and <strong>3</strong>. The value 1 indicates that the call was transferred to the agent. The value 0 indicates that the call failed to be transferred to the agent. The value 3 indicates that the call was not transferred to the agent.</li>
         * <li><strong>transferNumber</strong>: the phone number of the agent to whom the call was transferred.</li>
         * <li><strong>transferFailReason</strong>: the reason why the call failed to be transferred to the agent.</li>
         * <li><strong>callId</strong>: the unique receipt ID of the call, in the <code>taskId^bizId</code> format.</li>
         * <li><strong>recallCurTimes</strong>: the number of recalls.</li>
         * <li><strong>callStartTime</strong>: the start time of the call.</li>
         * <li><strong>callEndTime</strong>: the end time of the call.</li>
         * <li><strong>sureCount</strong>: the number of times that the robocall task was affirmed.</li>
         * <li><strong>denyCount</strong>: the number of times that the robocall task was denied.</li>
         * <li><strong>rejectCount</strong>: the number of times that the robocall task was rejected.</li>
         * <li><strong>customCount</strong>: the number of times that the robocall task was customized.</li>
         * <li><strong>knowledgeCount</strong>: the number of times that the knowledge base was queried.</li>
         * <li><strong>defaultCount</strong>: the default number of calls.</li>
         * <li><strong>knowledgeBusinessCount</strong>: the number of call failures caused by the business issues in the knowledge base.</li>
         * <li><strong>knowledgeCommonCount</strong>: the number of call failures caused by the common issues in the knowledge base.</li>
         * <li><strong>recordStatus</strong>: Indicates whether the call has a recording file. Valid values: <strong>1</strong>: The call has a recording file. <strong>2</strong>: The call does not have a recording file.</li>
         * <li><strong>recordFile</strong>: the download URL of the recording file.</li>
         * <li><strong>dialogDetail</strong>: the dialog details, in a JSON-formatted array. <strong>role</strong>: the object of the speech. <strong>content</strong>: the content of the speech. <strong>speakTime</strong>: the time of the speech.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;taskId&quot; : 1045001, &quot;caller&quot; : &quot;0571-8899****&quot;, &quot;called&quot; : &quot;130<strong><strong>0000&quot;, &quot;duration&quot; : &quot;60&quot;, &quot;label&quot; : &quot;Invitation&quot;, &quot;dialogCount&quot;: &quot;3&quot;, &quot;callResult&quot; : &quot;Not Available&quot;, &quot;hangupDirection&quot; : &quot;1&quot;, &quot;transferResult&quot; : &quot;3&quot;, &quot;transferNumber&quot; ：0571-8833</strong></strong>, &quot;transferFailReason&quot; ：&quot;User hangs up&quot;, &quot;callId&quot; ：&quot;116950320375^10375010****&quot;, &quot;recallCurTimes&quot; : 2, &quot;callStartTime&quot; : &quot;2019.06.14 15:22:23&quot;, &quot;callEndTime&quot; : &quot;2019.06.14 15:22:55&quot;, &quot;sureCount&quot; : 2, &quot;denyCount&quot; : 2, &quot;rejectCount&quot; : 0, &quot;customCount&quot; : 0, &quot;knowledgeCount&quot; : 0, &quot;defaultCount&quot; : 0, &quot;knowledgeBusinessCount&quot; : 0, &quot;knowledgeCommonCount&quot; : 0, &quot;recordStatus&quot;:1, &quot;recordFile&quot;: &quot;<a href="http://alicom-fc-record-biz.cn-hangzhou.oss.aliyun-inc.com/Freeswitch_RU_117074080001_ccd71132-8256-4eb4-9217-884e1d87c0d4_record.wav?Expires=1562740186&OSSAccessKeyId=bypFNbGJVk7****&Signature=99losPmytVl%2BMH85noZGD">http://alicom-fc-record-biz.cn-hangzhou.oss.aliyun-inc.com/Freeswitch_RU_117074080001_ccd71132-8256-4eb4-9217-884e1d87c0d4_record.wav?Expires=1562740186&amp;OSSAccessKeyId=bypFNbGJVk7****&amp;Signature=99losPmytVl%2BMH85noZGD</a>******&quot;, &quot;dialogDetail&quot;: [{&quot;role&quot;: &quot;robot&quot;,&quot;speakTime&quot;: &quot;2019-06-19 20:44:17&quot;,&quot;content&quot;:&quot;prologue&quot;}] }</p>
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
         * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryRobotTaskCallDetailResponseBody build() {
            return new QueryRobotTaskCallDetailResponseBody(this);
        } 

    } 

}
