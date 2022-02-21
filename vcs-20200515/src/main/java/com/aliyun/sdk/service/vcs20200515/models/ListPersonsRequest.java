// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPersonsRequest} extends {@link RequestModel}
 *
 * <p>ListPersonsRequest</p>
 */
public class ListPersonsRequest extends Request {
    @Body
    @NameInMap("AlgorithmType")
    private String algorithmType;

    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("EndTime")
    private String endTime;

    @Body
    @NameInMap("PageNo")
    private String pageNo;

    @Body
    @NameInMap("PageSize")
    private String pageSize;

    @Body
    @NameInMap("StartTime")
    private String startTime;

    private ListPersonsRequest(Builder builder) {
        super(builder);
        this.algorithmType = builder.algorithmType;
        this.corpId = builder.corpId;
        this.endTime = builder.endTime;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPersonsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmType
     */
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return pageNo
     */
    public String getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListPersonsRequest, Builder> {
        private String algorithmType; 
        private String corpId; 
        private String endTime; 
        private String pageNo; 
        private String pageSize; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListPersonsRequest response) {
            super(response);
            this.algorithmType = response.algorithmType;
            this.corpId = response.corpId;
            this.endTime = response.endTime;
            this.pageNo = response.pageNo;
            this.pageSize = response.pageSize;
            this.startTime = response.startTime;
        } 

        /**
         * AlgorithmType.
         */
        public Builder algorithmType(String algorithmType) {
            this.putBodyParameter("AlgorithmType", algorithmType);
            this.algorithmType = algorithmType;
            return this;
        }

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(String pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListPersonsRequest build() {
            return new ListPersonsRequest(this);
        } 

    } 

}
