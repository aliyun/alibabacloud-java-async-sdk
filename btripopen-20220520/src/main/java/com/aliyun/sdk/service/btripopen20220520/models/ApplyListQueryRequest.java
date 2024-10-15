// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ApplyListQueryRequest} extends {@link RequestModel}
 *
 * <p>ApplyListQueryRequest</p>
 */
public class ApplyListQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("all_apply")
    private Boolean allApply;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("depart_id")
    private String departId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("end_time")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gmt_modified")
    private String gmtModified;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("only_shang_lv_apply")
    private Boolean onlyShangLvApply;

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
    @com.aliyun.core.annotation.NameInMap("sub_corp_id")
    private String subCorpId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private Integer type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("union_no")
    private String unionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private ApplyListQueryRequest(Builder builder) {
        super(builder);
        this.allApply = builder.allApply;
        this.departId = builder.departId;
        this.endTime = builder.endTime;
        this.gmtModified = builder.gmtModified;
        this.onlyShangLvApply = builder.onlyShangLvApply;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.subCorpId = builder.subCorpId;
        this.type = builder.type;
        this.unionNo = builder.unionNo;
        this.userId = builder.userId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyListQueryRequest create() {
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
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return onlyShangLvApply
     */
    public Boolean getOnlyShangLvApply() {
        return this.onlyShangLvApply;
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
     * @return subCorpId
     */
    public String getSubCorpId() {
        return this.subCorpId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return unionNo
     */
    public String getUnionNo() {
        return this.unionNo;
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

    public static final class Builder extends Request.Builder<ApplyListQueryRequest, Builder> {
        private Boolean allApply; 
        private String departId; 
        private String endTime; 
        private String gmtModified; 
        private Boolean onlyShangLvApply; 
        private Integer page; 
        private Integer pageSize; 
        private String startTime; 
        private String subCorpId; 
        private Integer type; 
        private String unionNo; 
        private String userId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(ApplyListQueryRequest request) {
            super(request);
            this.allApply = request.allApply;
            this.departId = request.departId;
            this.endTime = request.endTime;
            this.gmtModified = request.gmtModified;
            this.onlyShangLvApply = request.onlyShangLvApply;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.subCorpId = request.subCorpId;
            this.type = request.type;
            this.unionNo = request.unionNo;
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
         * gmt_modified.
         */
        public Builder gmtModified(String gmtModified) {
            this.putQueryParameter("gmt_modified", gmtModified);
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * only_shang_lv_apply.
         */
        public Builder onlyShangLvApply(Boolean onlyShangLvApply) {
            this.putQueryParameter("only_shang_lv_apply", onlyShangLvApply);
            this.onlyShangLvApply = onlyShangLvApply;
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
         * sub_corp_id.
         */
        public Builder subCorpId(String subCorpId) {
            this.putQueryParameter("sub_corp_id", subCorpId);
            this.subCorpId = subCorpId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * union_no.
         */
        public Builder unionNo(String unionNo) {
            this.putQueryParameter("union_no", unionNo);
            this.unionNo = unionNo;
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
        public ApplyListQueryRequest build() {
            return new ApplyListQueryRequest(this);
        } 

    } 

}
