// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link HotlineSessionQueryRequest} extends {@link RequestModel}
 *
 * <p>HotlineSessionQueryRequest</p>
 */
public class HotlineSessionQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Acid")
    private String acid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcidList")
    private java.util.List<String> acidList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallResult")
    private String callResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallResultList")
    private java.util.List<String> callResultList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallType")
    private Integer callType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallTypeList")
    private java.util.List<Integer> callTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumberList")
    private java.util.List<String> calledNumberList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    private String callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumberList")
    private java.util.List<String> callingNumberList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupIdList")
    private java.util.List<Long> groupIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberId")
    private String memberId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberIdList")
    private java.util.List<String> memberIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberName")
    private String memberName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryEndTime")
    private Long queryEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryStartTime")
    private Long queryStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServicerId")
    private String servicerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServicerIdList")
    private java.util.List<String> servicerIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServicerName")
    private String servicerName;

    private HotlineSessionQueryRequest(Builder builder) {
        super(builder);
        this.acid = builder.acid;
        this.acidList = builder.acidList;
        this.callResult = builder.callResult;
        this.callResultList = builder.callResultList;
        this.callType = builder.callType;
        this.callTypeList = builder.callTypeList;
        this.calledNumber = builder.calledNumber;
        this.calledNumberList = builder.calledNumberList;
        this.callingNumber = builder.callingNumber;
        this.callingNumberList = builder.callingNumberList;
        this.groupId = builder.groupId;
        this.groupIdList = builder.groupIdList;
        this.groupName = builder.groupName;
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.memberId = builder.memberId;
        this.memberIdList = builder.memberIdList;
        this.memberName = builder.memberName;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.params = builder.params;
        this.queryEndTime = builder.queryEndTime;
        this.queryStartTime = builder.queryStartTime;
        this.requestId = builder.requestId;
        this.servicerId = builder.servicerId;
        this.servicerIdList = builder.servicerIdList;
        this.servicerName = builder.servicerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotlineSessionQueryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acid
     */
    public String getAcid() {
        return this.acid;
    }

    /**
     * @return acidList
     */
    public java.util.List<String> getAcidList() {
        return this.acidList;
    }

    /**
     * @return callResult
     */
    public String getCallResult() {
        return this.callResult;
    }

    /**
     * @return callResultList
     */
    public java.util.List<String> getCallResultList() {
        return this.callResultList;
    }

    /**
     * @return callType
     */
    public Integer getCallType() {
        return this.callType;
    }

    /**
     * @return callTypeList
     */
    public java.util.List<Integer> getCallTypeList() {
        return this.callTypeList;
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return calledNumberList
     */
    public java.util.List<String> getCalledNumberList() {
        return this.calledNumberList;
    }

    /**
     * @return callingNumber
     */
    public String getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return callingNumberList
     */
    public java.util.List<String> getCallingNumberList() {
        return this.callingNumberList;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupIdList
     */
    public java.util.List<Long> getGroupIdList() {
        return this.groupIdList;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return memberIdList
     */
    public java.util.List<String> getMemberIdList() {
        return this.memberIdList;
    }

    /**
     * @return memberName
     */
    public String getMemberName() {
        return this.memberName;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return queryEndTime
     */
    public Long getQueryEndTime() {
        return this.queryEndTime;
    }

    /**
     * @return queryStartTime
     */
    public Long getQueryStartTime() {
        return this.queryStartTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return servicerId
     */
    public String getServicerId() {
        return this.servicerId;
    }

    /**
     * @return servicerIdList
     */
    public java.util.List<String> getServicerIdList() {
        return this.servicerIdList;
    }

    /**
     * @return servicerName
     */
    public String getServicerName() {
        return this.servicerName;
    }

    public static final class Builder extends Request.Builder<HotlineSessionQueryRequest, Builder> {
        private String acid; 
        private java.util.List<String> acidList; 
        private String callResult; 
        private java.util.List<String> callResultList; 
        private Integer callType; 
        private java.util.List<Integer> callTypeList; 
        private String calledNumber; 
        private java.util.List<String> calledNumberList; 
        private String callingNumber; 
        private java.util.List<String> callingNumberList; 
        private Long groupId; 
        private java.util.List<Long> groupIdList; 
        private String groupName; 
        private String id; 
        private String instanceId; 
        private String memberId; 
        private java.util.List<String> memberIdList; 
        private String memberName; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String params; 
        private Long queryEndTime; 
        private Long queryStartTime; 
        private String requestId; 
        private String servicerId; 
        private java.util.List<String> servicerIdList; 
        private String servicerName; 

        private Builder() {
            super();
        } 

        private Builder(HotlineSessionQueryRequest request) {
            super(request);
            this.acid = request.acid;
            this.acidList = request.acidList;
            this.callResult = request.callResult;
            this.callResultList = request.callResultList;
            this.callType = request.callType;
            this.callTypeList = request.callTypeList;
            this.calledNumber = request.calledNumber;
            this.calledNumberList = request.calledNumberList;
            this.callingNumber = request.callingNumber;
            this.callingNumberList = request.callingNumberList;
            this.groupId = request.groupId;
            this.groupIdList = request.groupIdList;
            this.groupName = request.groupName;
            this.id = request.id;
            this.instanceId = request.instanceId;
            this.memberId = request.memberId;
            this.memberIdList = request.memberIdList;
            this.memberName = request.memberName;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.params = request.params;
            this.queryEndTime = request.queryEndTime;
            this.queryStartTime = request.queryStartTime;
            this.requestId = request.requestId;
            this.servicerId = request.servicerId;
            this.servicerIdList = request.servicerIdList;
            this.servicerName = request.servicerName;
        } 

        /**
         * <p>The session ID. The acid in the websocket after an inbound call.</p>
         * 
         * <strong>example:</strong>
         * <p>7719786****</p>
         */
        public Builder acid(String acid) {
            this.putQueryParameter("Acid", acid);
            this.acid = acid;
            return this;
        }

        /**
         * <p>The list of session IDs.</p>
         */
        public Builder acidList(java.util.List<String> acidList) {
            this.putQueryParameter("AcidList", acidList);
            this.acidList = acidList;
            return this;
        }

        /**
         * <p>The call result. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: normal hangup.</li>
         * <li><strong>touchRouteError</strong>: queue hangup.</li>
         * <li><strong>touchInQueue</strong>: queue hangup.</li>
         * <li><strong>touchInLoss</strong>: queue hangup.</li>
         * <li><strong>userHangup</strong>: user hangup or IVR hangup.</li>
         * <li><strong>sysHangup</strong>: system hangup or IVR hangup.</li>
         * <li><strong>transferAgent</strong>: user hangup or IVR hangup.</li>
         * <li><strong>dailing</strong>: agent hangup or ringing hangup.</li>
         * <li><strong>TouchRingCallLoss</strong>: queue hangup or ringing hangup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder callResult(String callResult) {
            this.putQueryParameter("CallResult", callResult);
            this.callResult = callResult;
            return this;
        }

        /**
         * <p>The list of call results.</p>
         */
        public Builder callResultList(java.util.List<String> callResultList) {
            this.putQueryParameter("CallResultList", callResultList);
            this.callResultList = callResultList;
            return this;
        }

        /**
         * <p>The call type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: outbound call.</li>
         * <li><strong>2</strong>: inbound call.</li>
         * <li><strong>3</strong>: transferred call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder callType(Integer callType) {
            this.putQueryParameter("CallType", callType);
            this.callType = callType;
            return this;
        }

        /**
         * <p>The list of call types.</p>
         */
        public Builder callTypeList(java.util.List<Integer> callTypeList) {
            this.putQueryParameter("CallTypeList", callTypeList);
            this.callTypeList = callTypeList;
            return this;
        }

        /**
         * <p>The number of the caller. For example, a mobile phone number of a user, an agent number, or a robot number.</p>
         * 
         * <strong>example:</strong>
         * <p>135615****</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>The list of called numbers.</p>
         */
        public Builder calledNumberList(java.util.List<String> calledNumberList) {
            this.putQueryParameter("CalledNumberList", calledNumberList);
            this.calledNumberList = calledNumberList;
            return this;
        }

        /**
         * <p>The number of the callee. For example, a mobile phone number of a user, an agent number, or a robot number.</p>
         * 
         * <strong>example:</strong>
         * <p>057177****</p>
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * <p>The list of calling numbers.</p>
         */
        public Builder callingNumberList(java.util.List<String> callingNumberList) {
            this.putQueryParameter("CallingNumberList", callingNumberList);
            this.callingNumberList = callingNumberList;
            return this;
        }

        /**
         * <p>The ID of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The list of skill group IDs.</p>
         */
        public Builder groupIdList(java.util.List<Long> groupIdList) {
            this.putQueryParameter("GroupIdList", groupIdList);
            this.groupIdList = groupIdList;
            return this;
        }

        /**
         * <p>The name of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>AutomationSkillGroup</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The globally unique ID of the call details.</p>
         * 
         * <strong>example:</strong>
         * <p>acc1c58dab4a4****0e3813c66</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The ID of the Artificial Intelligence Cloud Call Service (AICCS) instance.
         * You can obtain the instance ID from <b>Instance Management</b> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre-cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The member ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7856****</p>
         */
        public Builder memberId(String memberId) {
            this.putQueryParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * <p>The list of member IDs.</p>
         */
        public Builder memberIdList(java.util.List<String> memberIdList) {
            this.putQueryParameter("MemberIdList", memberIdList);
            this.memberIdList = memberIdList;
            return this;
        }

        /**
         * <p>The member name.</p>
         * 
         * <strong>example:</strong>
         * <p>AnonymousMember</p>
         */
        public Builder memberName(String memberName) {
            this.putQueryParameter("MemberName", memberName);
            this.memberName = memberName;
            return this;
        }

        /**
         * <p>The current page number. The value must be greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. The value must be greater than <strong>0</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The extended parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>The end timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614829721</p>
         */
        public Builder queryEndTime(Long queryEndTime) {
            this.putQueryParameter("QueryEndTime", queryEndTime);
            this.queryEndTime = queryEndTime;
            return this;
        }

        /**
         * <p>The start timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614828721</p>
         */
        public Builder queryStartTime(Long queryStartTime) {
            this.putQueryParameter("QueryStartTime", queryStartTime);
            this.queryStartTime = queryStartTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE338D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>555555</p>
         */
        public Builder servicerId(String servicerId) {
            this.putQueryParameter("ServicerId", servicerId);
            this.servicerId = servicerId;
            return this;
        }

        /**
         * <p>The list of agent IDs.</p>
         */
        public Builder servicerIdList(java.util.List<String> servicerIdList) {
            this.putQueryParameter("ServicerIdList", servicerIdList);
            this.servicerIdList = servicerIdList;
            return this;
        }

        /**
         * <p>The agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>TestAgent</p>
         */
        public Builder servicerName(String servicerName) {
            this.putQueryParameter("ServicerName", servicerName);
            this.servicerName = servicerName;
            return this;
        }

        @Override
        public HotlineSessionQueryRequest build() {
            return new HotlineSessionQueryRequest(this);
        } 

    } 

}
