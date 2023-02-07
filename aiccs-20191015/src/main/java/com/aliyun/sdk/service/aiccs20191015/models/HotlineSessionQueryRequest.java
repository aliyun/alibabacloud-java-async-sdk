// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotlineSessionQueryRequest} extends {@link RequestModel}
 *
 * <p>HotlineSessionQueryRequest</p>
 */
public class HotlineSessionQueryRequest extends Request {
    @Query
    @NameInMap("Acid")
    private String acid;

    @Query
    @NameInMap("AcidList")
    private java.util.List < String > acidList;

    @Query
    @NameInMap("CallResult")
    private String callResult;

    @Query
    @NameInMap("CallResultList")
    private java.util.List < String > callResultList;

    @Query
    @NameInMap("CallType")
    private Integer callType;

    @Query
    @NameInMap("CallTypeList")
    private java.util.List < Integer > callTypeList;

    @Query
    @NameInMap("CalledNumber")
    private String calledNumber;

    @Query
    @NameInMap("CalledNumberList")
    private java.util.List < String > calledNumberList;

    @Query
    @NameInMap("CallingNumber")
    private String callingNumber;

    @Query
    @NameInMap("CallingNumberList")
    private java.util.List < String > callingNumberList;

    @Query
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("GroupIdList")
    private java.util.List < Long > groupIdList;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MemberId")
    private String memberId;

    @Query
    @NameInMap("MemberIdList")
    private java.util.List < String > memberIdList;

    @Query
    @NameInMap("MemberName")
    private String memberName;

    @Query
    @NameInMap("PageNo")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("Params")
    private String params;

    @Query
    @NameInMap("QueryEndTime")
    private Long queryEndTime;

    @Query
    @NameInMap("QueryStartTime")
    private Long queryStartTime;

    @Query
    @NameInMap("RequestId")
    private String requestId;

    @Query
    @NameInMap("ServicerId")
    private String servicerId;

    @Query
    @NameInMap("ServicerIdList")
    private java.util.List < String > servicerIdList;

    @Query
    @NameInMap("ServicerName")
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
    public java.util.List < String > getAcidList() {
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
    public java.util.List < String > getCallResultList() {
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
    public java.util.List < Integer > getCallTypeList() {
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
    public java.util.List < String > getCalledNumberList() {
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
    public java.util.List < String > getCallingNumberList() {
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
    public java.util.List < Long > getGroupIdList() {
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
    public java.util.List < String > getMemberIdList() {
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
    public java.util.List < String > getServicerIdList() {
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
        private java.util.List < String > acidList; 
        private String callResult; 
        private java.util.List < String > callResultList; 
        private Integer callType; 
        private java.util.List < Integer > callTypeList; 
        private String calledNumber; 
        private java.util.List < String > calledNumberList; 
        private String callingNumber; 
        private java.util.List < String > callingNumberList; 
        private Long groupId; 
        private java.util.List < Long > groupIdList; 
        private String groupName; 
        private String id; 
        private String instanceId; 
        private String memberId; 
        private java.util.List < String > memberIdList; 
        private String memberName; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String params; 
        private Long queryEndTime; 
        private Long queryStartTime; 
        private String requestId; 
        private String servicerId; 
        private java.util.List < String > servicerIdList; 
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
         * Acid.
         */
        public Builder acid(String acid) {
            this.putQueryParameter("Acid", acid);
            this.acid = acid;
            return this;
        }

        /**
         * AcidList.
         */
        public Builder acidList(java.util.List < String > acidList) {
            this.putQueryParameter("AcidList", acidList);
            this.acidList = acidList;
            return this;
        }

        /**
         * CallResult.
         */
        public Builder callResult(String callResult) {
            this.putQueryParameter("CallResult", callResult);
            this.callResult = callResult;
            return this;
        }

        /**
         * CallResultList.
         */
        public Builder callResultList(java.util.List < String > callResultList) {
            this.putQueryParameter("CallResultList", callResultList);
            this.callResultList = callResultList;
            return this;
        }

        /**
         * CallType.
         */
        public Builder callType(Integer callType) {
            this.putQueryParameter("CallType", callType);
            this.callType = callType;
            return this;
        }

        /**
         * CallTypeList.
         */
        public Builder callTypeList(java.util.List < Integer > callTypeList) {
            this.putQueryParameter("CallTypeList", callTypeList);
            this.callTypeList = callTypeList;
            return this;
        }

        /**
         * CalledNumber.
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * CalledNumberList.
         */
        public Builder calledNumberList(java.util.List < String > calledNumberList) {
            this.putQueryParameter("CalledNumberList", calledNumberList);
            this.calledNumberList = calledNumberList;
            return this;
        }

        /**
         * CallingNumber.
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * CallingNumberList.
         */
        public Builder callingNumberList(java.util.List < String > callingNumberList) {
            this.putQueryParameter("CallingNumberList", callingNumberList);
            this.callingNumberList = callingNumberList;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupIdList.
         */
        public Builder groupIdList(java.util.List < Long > groupIdList) {
            this.putQueryParameter("GroupIdList", groupIdList);
            this.groupIdList = groupIdList;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MemberId.
         */
        public Builder memberId(String memberId) {
            this.putQueryParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * MemberIdList.
         */
        public Builder memberIdList(java.util.List < String > memberIdList) {
            this.putQueryParameter("MemberIdList", memberIdList);
            this.memberIdList = memberIdList;
            return this;
        }

        /**
         * MemberName.
         */
        public Builder memberName(String memberName) {
            this.putQueryParameter("MemberName", memberName);
            this.memberName = memberName;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * QueryEndTime.
         */
        public Builder queryEndTime(Long queryEndTime) {
            this.putQueryParameter("QueryEndTime", queryEndTime);
            this.queryEndTime = queryEndTime;
            return this;
        }

        /**
         * QueryStartTime.
         */
        public Builder queryStartTime(Long queryStartTime) {
            this.putQueryParameter("QueryStartTime", queryStartTime);
            this.queryStartTime = queryStartTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * ServicerId.
         */
        public Builder servicerId(String servicerId) {
            this.putQueryParameter("ServicerId", servicerId);
            this.servicerId = servicerId;
            return this;
        }

        /**
         * ServicerIdList.
         */
        public Builder servicerIdList(java.util.List < String > servicerIdList) {
            this.putQueryParameter("ServicerIdList", servicerIdList);
            this.servicerIdList = servicerIdList;
            return this;
        }

        /**
         * ServicerName.
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
