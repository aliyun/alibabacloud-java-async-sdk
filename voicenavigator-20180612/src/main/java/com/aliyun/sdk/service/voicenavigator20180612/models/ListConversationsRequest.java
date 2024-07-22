// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConversationsRequest} extends {@link RequestModel}
 *
 * <p>ListConversationsRequest</p>
 */
public class ListConversationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTimeLeftRange")
    private Long beginTimeLeftRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTimeRightRange")
    private Long beginTimeRightRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    private String callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSandBox")
    private String isSandBox;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Result")
    private Long result;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoundsLeftRange")
    private Integer roundsLeftRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoundsRightRange")
    private Integer roundsRightRange;

    private ListConversationsRequest(Builder builder) {
        super(builder);
        this.beginTimeLeftRange = builder.beginTimeLeftRange;
        this.beginTimeRightRange = builder.beginTimeRightRange;
        this.callingNumber = builder.callingNumber;
        this.instanceId = builder.instanceId;
        this.isSandBox = builder.isSandBox;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.result = builder.result;
        this.roundsLeftRange = builder.roundsLeftRange;
        this.roundsRightRange = builder.roundsRightRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConversationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTimeLeftRange
     */
    public Long getBeginTimeLeftRange() {
        return this.beginTimeLeftRange;
    }

    /**
     * @return beginTimeRightRange
     */
    public Long getBeginTimeRightRange() {
        return this.beginTimeRightRange;
    }

    /**
     * @return callingNumber
     */
    public String getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isSandBox
     */
    public String getIsSandBox() {
        return this.isSandBox;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return result
     */
    public Long getResult() {
        return this.result;
    }

    /**
     * @return roundsLeftRange
     */
    public Integer getRoundsLeftRange() {
        return this.roundsLeftRange;
    }

    /**
     * @return roundsRightRange
     */
    public Integer getRoundsRightRange() {
        return this.roundsRightRange;
    }

    public static final class Builder extends Request.Builder<ListConversationsRequest, Builder> {
        private Long beginTimeLeftRange; 
        private Long beginTimeRightRange; 
        private String callingNumber; 
        private String instanceId; 
        private String isSandBox; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String query; 
        private Long result; 
        private Integer roundsLeftRange; 
        private Integer roundsRightRange; 

        private Builder() {
            super();
        } 

        private Builder(ListConversationsRequest request) {
            super(request);
            this.beginTimeLeftRange = request.beginTimeLeftRange;
            this.beginTimeRightRange = request.beginTimeRightRange;
            this.callingNumber = request.callingNumber;
            this.instanceId = request.instanceId;
            this.isSandBox = request.isSandBox;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.query = request.query;
            this.result = request.result;
            this.roundsLeftRange = request.roundsLeftRange;
            this.roundsRightRange = request.roundsRightRange;
        } 

        /**
         * BeginTimeLeftRange.
         */
        public Builder beginTimeLeftRange(Long beginTimeLeftRange) {
            this.putQueryParameter("BeginTimeLeftRange", beginTimeLeftRange);
            this.beginTimeLeftRange = beginTimeLeftRange;
            return this;
        }

        /**
         * BeginTimeRightRange.
         */
        public Builder beginTimeRightRange(Long beginTimeRightRange) {
            this.putQueryParameter("BeginTimeRightRange", beginTimeRightRange);
            this.beginTimeRightRange = beginTimeRightRange;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsSandBox.
         */
        public Builder isSandBox(String isSandBox) {
            this.putQueryParameter("IsSandBox", isSandBox);
            this.isSandBox = isSandBox;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * Query.
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Long result) {
            this.putQueryParameter("Result", result);
            this.result = result;
            return this;
        }

        /**
         * RoundsLeftRange.
         */
        public Builder roundsLeftRange(Integer roundsLeftRange) {
            this.putQueryParameter("RoundsLeftRange", roundsLeftRange);
            this.roundsLeftRange = roundsLeftRange;
            return this;
        }

        /**
         * RoundsRightRange.
         */
        public Builder roundsRightRange(Integer roundsRightRange) {
            this.putQueryParameter("RoundsRightRange", roundsRightRange);
            this.roundsRightRange = roundsRightRange;
            return this;
        }

        @Override
        public ListConversationsRequest build() {
            return new ListConversationsRequest(this);
        } 

    } 

}
