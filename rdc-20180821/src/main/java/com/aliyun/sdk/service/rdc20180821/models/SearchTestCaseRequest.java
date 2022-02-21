// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTestCaseRequest} extends {@link RequestModel}
 *
 * <p>SearchTestCaseRequest</p>
 */
public class SearchTestCaseRequest extends Request {
    @Body
    @NameInMap("AkProjectId")
    @Validation(required = true)
    private String akProjectId;

    @Body
    @NameInMap("CaseTag")
    private String caseTag;

    @Query
    @NameInMap("CorpIdentifier")
    @Validation(required = true)
    private String corpIdentifier;

    @Body
    @NameInMap("CreateDateEnd")
    private String createDateEnd;

    @Body
    @NameInMap("CreateDateStart")
    private String createDateStart;

    @Body
    @NameInMap("PageNum")
    private String pageNum;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("UpdateDateEnd")
    private String updateDateEnd;

    @Body
    @NameInMap("UpdateDateStart")
    private String updateDateStart;

    private SearchTestCaseRequest(Builder builder) {
        super(builder);
        this.akProjectId = builder.akProjectId;
        this.caseTag = builder.caseTag;
        this.corpIdentifier = builder.corpIdentifier;
        this.createDateEnd = builder.createDateEnd;
        this.createDateStart = builder.createDateStart;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.updateDateEnd = builder.updateDateEnd;
        this.updateDateStart = builder.updateDateStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTestCaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return akProjectId
     */
    public String getAkProjectId() {
        return this.akProjectId;
    }

    /**
     * @return caseTag
     */
    public String getCaseTag() {
        return this.caseTag;
    }

    /**
     * @return corpIdentifier
     */
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    /**
     * @return createDateEnd
     */
    public String getCreateDateEnd() {
        return this.createDateEnd;
    }

    /**
     * @return createDateStart
     */
    public String getCreateDateStart() {
        return this.createDateStart;
    }

    /**
     * @return pageNum
     */
    public String getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return updateDateEnd
     */
    public String getUpdateDateEnd() {
        return this.updateDateEnd;
    }

    /**
     * @return updateDateStart
     */
    public String getUpdateDateStart() {
        return this.updateDateStart;
    }

    public static final class Builder extends Request.Builder<SearchTestCaseRequest, Builder> {
        private String akProjectId; 
        private String caseTag; 
        private String corpIdentifier; 
        private String createDateEnd; 
        private String createDateStart; 
        private String pageNum; 
        private Integer pageSize; 
        private String updateDateEnd; 
        private String updateDateStart; 

        private Builder() {
            super();
        } 

        private Builder(SearchTestCaseRequest response) {
            super(response);
            this.akProjectId = response.akProjectId;
            this.caseTag = response.caseTag;
            this.corpIdentifier = response.corpIdentifier;
            this.createDateEnd = response.createDateEnd;
            this.createDateStart = response.createDateStart;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.updateDateEnd = response.updateDateEnd;
            this.updateDateStart = response.updateDateStart;
        } 

        /**
         * AkProjectId.
         */
        public Builder akProjectId(String akProjectId) {
            this.putBodyParameter("AkProjectId", akProjectId);
            this.akProjectId = akProjectId;
            return this;
        }

        /**
         * CaseTag.
         */
        public Builder caseTag(String caseTag) {
            this.putBodyParameter("CaseTag", caseTag);
            this.caseTag = caseTag;
            return this;
        }

        /**
         * CorpIdentifier.
         */
        public Builder corpIdentifier(String corpIdentifier) {
            this.putQueryParameter("CorpIdentifier", corpIdentifier);
            this.corpIdentifier = corpIdentifier;
            return this;
        }

        /**
         * CreateDateEnd.
         */
        public Builder createDateEnd(String createDateEnd) {
            this.putBodyParameter("CreateDateEnd", createDateEnd);
            this.createDateEnd = createDateEnd;
            return this;
        }

        /**
         * CreateDateStart.
         */
        public Builder createDateStart(String createDateStart) {
            this.putBodyParameter("CreateDateStart", createDateStart);
            this.createDateStart = createDateStart;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(String pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * UpdateDateEnd.
         */
        public Builder updateDateEnd(String updateDateEnd) {
            this.putBodyParameter("UpdateDateEnd", updateDateEnd);
            this.updateDateEnd = updateDateEnd;
            return this;
        }

        /**
         * UpdateDateStart.
         */
        public Builder updateDateStart(String updateDateStart) {
            this.putBodyParameter("UpdateDateStart", updateDateStart);
            this.updateDateStart = updateDateStart;
            return this;
        }

        @Override
        public SearchTestCaseRequest build() {
            return new SearchTestCaseRequest(this);
        } 

    } 

}
