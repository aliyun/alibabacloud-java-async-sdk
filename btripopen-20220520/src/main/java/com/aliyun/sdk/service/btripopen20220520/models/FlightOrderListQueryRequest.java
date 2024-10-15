// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FlightOrderListQueryRequest} extends {@link RequestModel}
 *
 * <p>FlightOrderListQueryRequest</p>
 */
public class FlightOrderListQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("all_apply")
    private Boolean allApply;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apply_id")
    private Long applyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("depart_id")
    private String departId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("end_time")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_size")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("start_time")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("thirdpart_apply_id")
    private String thirdpartApplyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("update_end_time")
    private String updateEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("update_start_time")
    private String updateStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private FlightOrderListQueryRequest(Builder builder) {
        super(builder);
        this.allApply = builder.allApply;
        this.applyId = builder.applyId;
        this.departId = builder.departId;
        this.endTime = builder.endTime;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.thirdpartApplyId = builder.thirdpartApplyId;
        this.updateEndTime = builder.updateEndTime;
        this.updateStartTime = builder.updateStartTime;
        this.userId = builder.userId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightOrderListQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allApply
     */
    public Boolean getAllApply() {
        return this.allApply;
    }

    /**
     * @return applyId
     */
    public Long getApplyId() {
        return this.applyId;
    }

    /**
     * @return departId
     */
    public String getDepartId() {
        return this.departId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return thirdpartApplyId
     */
    public String getThirdpartApplyId() {
        return this.thirdpartApplyId;
    }

    /**
     * @return updateEndTime
     */
    public String getUpdateEndTime() {
        return this.updateEndTime;
    }

    /**
     * @return updateStartTime
     */
    public String getUpdateStartTime() {
        return this.updateStartTime;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<FlightOrderListQueryRequest, Builder> {
        private Boolean allApply; 
        private Long applyId; 
        private String departId; 
        private String endTime; 
        private Integer page; 
        private Integer pageSize; 
        private String startTime; 
        private String thirdpartApplyId; 
        private String updateEndTime; 
        private String updateStartTime; 
        private String userId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightOrderListQueryRequest request) {
            super(request);
            this.allApply = request.allApply;
            this.applyId = request.applyId;
            this.departId = request.departId;
            this.endTime = request.endTime;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.thirdpartApplyId = request.thirdpartApplyId;
            this.updateEndTime = request.updateEndTime;
            this.updateStartTime = request.updateStartTime;
            this.userId = request.userId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * all_apply.
         */
        public Builder allApply(Boolean allApply) {
            this.putQueryParameter("all_apply", allApply);
            this.allApply = allApply;
            return this;
        }

        /**
         * apply_id.
         */
        public Builder applyId(Long applyId) {
            this.putQueryParameter("apply_id", applyId);
            this.applyId = applyId;
            return this;
        }

        /**
         * depart_id.
         */
        public Builder departId(String departId) {
            this.putQueryParameter("depart_id", departId);
            this.departId = departId;
            return this;
        }

        /**
         * end_time.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("end_time", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * page_size.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * start_time.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("start_time", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * thirdpart_apply_id.
         */
        public Builder thirdpartApplyId(String thirdpartApplyId) {
            this.putQueryParameter("thirdpart_apply_id", thirdpartApplyId);
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }

        /**
         * update_end_time.
         */
        public Builder updateEndTime(String updateEndTime) {
            this.putQueryParameter("update_end_time", updateEndTime);
            this.updateEndTime = updateEndTime;
            return this;
        }

        /**
         * update_start_time.
         */
        public Builder updateStartTime(String updateStartTime) {
            this.putQueryParameter("update_start_time", updateStartTime);
            this.updateStartTime = updateStartTime;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public FlightOrderListQueryRequest build() {
            return new FlightOrderListQueryRequest(this);
        } 

    } 

}
