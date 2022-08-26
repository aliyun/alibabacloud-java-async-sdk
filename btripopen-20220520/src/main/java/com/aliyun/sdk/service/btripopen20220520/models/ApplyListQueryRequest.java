// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyListQueryRequest} extends {@link RequestModel}
 *
 * <p>ApplyListQueryRequest</p>
 */
public class ApplyListQueryRequest extends Request {
    @Query
    @NameInMap("all_apply")
    private Boolean allApply;

    @Query
    @NameInMap("depart_id")
    private String departId;

    @Query
    @NameInMap("end_time")
    private String endTime;

    @Query
    @NameInMap("gmt_modified")
    private String gmtModified;

    @Query
    @NameInMap("only_shang_lv_apply")
    private Boolean onlyShangLvApply;

    @Query
    @NameInMap("page")
    private Integer page;

    @Query
    @NameInMap("page_size")
    private Integer pageSize;

    @Query
    @NameInMap("start_time")
    private String startTime;

    @Query
    @NameInMap("type")
    private Integer type;

    @Query
    @NameInMap("union_no")
    private String unionNo;

    @Query
    @NameInMap("user_id")
    private String userId;

    @Header
    @NameInMap("x-acs-btrip-so-corp-token")
    @Validation(required = true)
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
            this.type = request.type;
            this.unionNo = request.unionNo;
            this.userId = request.userId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * 所有申请单（含已报销的）
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
         * 仅商旅申请单
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
         * type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * 关联单号
         */
        public Builder unionNo(String unionNo) {
            this.putQueryParameter("union_no", unionNo);
            this.unionNo = unionNo;
            return this;
        }

        /**
         * 无userId时传缺省值superAdmin
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
