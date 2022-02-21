// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchFaceRequest} extends {@link RequestModel}
 *
 * <p>SearchFaceRequest</p>
 */
public class SearchFaceRequest extends Request {
    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("EndTimeStamp")
    @Validation(required = true)
    private Long endTimeStamp;

    @Body
    @NameInMap("GbId")
    private String gbId;

    @Body
    @NameInMap("OptionList")
    private java.util.Map < String, ? > optionList;

    @Body
    @NameInMap("PageNo")
    @Validation(required = true)
    private Integer pageNo;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Body
    @NameInMap("StartTimeStamp")
    @Validation(required = true)
    private Long startTimeStamp;

    private SearchFaceRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.endTimeStamp = builder.endTimeStamp;
        this.gbId = builder.gbId;
        this.optionList = builder.optionList;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.startTimeStamp = builder.startTimeStamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchFaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return endTimeStamp
     */
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    /**
     * @return gbId
     */
    public String getGbId() {
        return this.gbId;
    }

    /**
     * @return optionList
     */
    public java.util.Map < String, ? > getOptionList() {
        return this.optionList;
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
     * @return startTimeStamp
     */
    public Long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    public static final class Builder extends Request.Builder<SearchFaceRequest, Builder> {
        private String corpId; 
        private Long endTimeStamp; 
        private String gbId; 
        private java.util.Map < String, ? > optionList; 
        private Integer pageNo; 
        private Integer pageSize; 
        private Long startTimeStamp; 

        private Builder() {
            super();
        } 

        private Builder(SearchFaceRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.endTimeStamp = response.endTimeStamp;
            this.gbId = response.gbId;
            this.optionList = response.optionList;
            this.pageNo = response.pageNo;
            this.pageSize = response.pageSize;
            this.startTimeStamp = response.startTimeStamp;
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
         * EndTimeStamp.
         */
        public Builder endTimeStamp(Long endTimeStamp) {
            this.putBodyParameter("EndTimeStamp", endTimeStamp);
            this.endTimeStamp = endTimeStamp;
            return this;
        }

        /**
         * GbId.
         */
        public Builder gbId(String gbId) {
            this.putBodyParameter("GbId", gbId);
            this.gbId = gbId;
            return this;
        }

        /**
         * OptionList.
         */
        public Builder optionList(java.util.Map < String, ? > optionList) {
            this.putBodyParameter("OptionList", optionList);
            this.optionList = optionList;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * StartTimeStamp.
         */
        public Builder startTimeStamp(Long startTimeStamp) {
            this.putBodyParameter("StartTimeStamp", startTimeStamp);
            this.startTimeStamp = startTimeStamp;
            return this;
        }

        @Override
        public SearchFaceRequest build() {
            return new SearchFaceRequest(this);
        } 

    } 

}
