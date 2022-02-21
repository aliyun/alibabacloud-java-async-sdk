// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPersonListRequest} extends {@link RequestModel}
 *
 * <p>GetPersonListRequest</p>
 */
public class GetPersonListRequest extends Request {
    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("CorpIdList")
    private java.util.Map < String, ? > corpIdList;

    @Body
    @NameInMap("FaceMatchingRateThreshold")
    private String faceMatchingRateThreshold;

    @Body
    @NameInMap("FaceUrl")
    private String faceUrl;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Long pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    @Body
    @NameInMap("PersonIdList")
    private java.util.Map < String, ? > personIdList;

    private GetPersonListRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.corpIdList = builder.corpIdList;
        this.faceMatchingRateThreshold = builder.faceMatchingRateThreshold;
        this.faceUrl = builder.faceUrl;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.personIdList = builder.personIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPersonListRequest create() {
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
     * @return corpIdList
     */
    public java.util.Map < String, ? > getCorpIdList() {
        return this.corpIdList;
    }

    /**
     * @return faceMatchingRateThreshold
     */
    public String getFaceMatchingRateThreshold() {
        return this.faceMatchingRateThreshold;
    }

    /**
     * @return faceUrl
     */
    public String getFaceUrl() {
        return this.faceUrl;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return personIdList
     */
    public java.util.Map < String, ? > getPersonIdList() {
        return this.personIdList;
    }

    public static final class Builder extends Request.Builder<GetPersonListRequest, Builder> {
        private String corpId; 
        private java.util.Map < String, ? > corpIdList; 
        private String faceMatchingRateThreshold; 
        private String faceUrl; 
        private Long pageNumber; 
        private Long pageSize; 
        private java.util.Map < String, ? > personIdList; 

        private Builder() {
            super();
        } 

        private Builder(GetPersonListRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.corpIdList = response.corpIdList;
            this.faceMatchingRateThreshold = response.faceMatchingRateThreshold;
            this.faceUrl = response.faceUrl;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.personIdList = response.personIdList;
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
         * CorpIdList.
         */
        public Builder corpIdList(java.util.Map < String, ? > corpIdList) {
            this.putBodyParameter("CorpIdList", corpIdList);
            this.corpIdList = corpIdList;
            return this;
        }

        /**
         * FaceMatchingRateThreshold.
         */
        public Builder faceMatchingRateThreshold(String faceMatchingRateThreshold) {
            this.putBodyParameter("FaceMatchingRateThreshold", faceMatchingRateThreshold);
            this.faceMatchingRateThreshold = faceMatchingRateThreshold;
            return this;
        }

        /**
         * FaceUrl.
         */
        public Builder faceUrl(String faceUrl) {
            this.putBodyParameter("FaceUrl", faceUrl);
            this.faceUrl = faceUrl;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PersonIdList.
         */
        public Builder personIdList(java.util.Map < String, ? > personIdList) {
            this.putBodyParameter("PersonIdList", personIdList);
            this.personIdList = personIdList;
            return this;
        }

        @Override
        public GetPersonListRequest build() {
            return new GetPersonListRequest(this);
        } 

    } 

}
