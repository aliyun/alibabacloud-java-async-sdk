// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link IFlightOrderListQueryRequest} extends {@link RequestModel}
 *
 * <p>IFlightOrderListQueryRequest</p>
 */
public class IFlightOrderListQueryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apply_id_list")
    private java.util.List < String > applyIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("book_type_list")
    private java.util.List < Integer > bookTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("booker_id")
    private java.util.List < String > bookerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("end_date")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_size")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scroll_id")
    private String scrollId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("start_date")
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("third_part_apply_id_list")
    private java.util.List < String > thirdPartApplyIdList;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private IFlightOrderListQueryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applyIdList = builder.applyIdList;
        this.bookTypeList = builder.bookTypeList;
        this.bookerId = builder.bookerId;
        this.endDate = builder.endDate;
        this.pageSize = builder.pageSize;
        this.scrollId = builder.scrollId;
        this.startDate = builder.startDate;
        this.thirdPartApplyIdList = builder.thirdPartApplyIdList;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IFlightOrderListQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return applyIdList
     */
    public java.util.List < String > getApplyIdList() {
        return this.applyIdList;
    }

    /**
     * @return bookTypeList
     */
    public java.util.List < Integer > getBookTypeList() {
        return this.bookTypeList;
    }

    /**
     * @return bookerId
     */
    public java.util.List < String > getBookerId() {
        return this.bookerId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scrollId
     */
    public String getScrollId() {
        return this.scrollId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return thirdPartApplyIdList
     */
    public java.util.List < String > getThirdPartApplyIdList() {
        return this.thirdPartApplyIdList;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<IFlightOrderListQueryRequest, Builder> {
        private String regionId; 
        private java.util.List < String > applyIdList; 
        private java.util.List < Integer > bookTypeList; 
        private java.util.List < String > bookerId; 
        private String endDate; 
        private Integer pageSize; 
        private String scrollId; 
        private String startDate; 
        private java.util.List < String > thirdPartApplyIdList; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(IFlightOrderListQueryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applyIdList = request.applyIdList;
            this.bookTypeList = request.bookTypeList;
            this.bookerId = request.bookerId;
            this.endDate = request.endDate;
            this.pageSize = request.pageSize;
            this.scrollId = request.scrollId;
            this.startDate = request.startDate;
            this.thirdPartApplyIdList = request.thirdPartApplyIdList;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * apply_id_list.
         */
        public Builder applyIdList(java.util.List < String > applyIdList) {
            String applyIdListShrink = shrink(applyIdList, "apply_id_list", "json");
            this.putQueryParameter("apply_id_list", applyIdListShrink);
            this.applyIdList = applyIdList;
            return this;
        }

        /**
         * book_type_list.
         */
        public Builder bookTypeList(java.util.List < Integer > bookTypeList) {
            String bookTypeListShrink = shrink(bookTypeList, "book_type_list", "json");
            this.putQueryParameter("book_type_list", bookTypeListShrink);
            this.bookTypeList = bookTypeList;
            return this;
        }

        /**
         * booker_id.
         */
        public Builder bookerId(java.util.List < String > bookerId) {
            String bookerIdShrink = shrink(bookerId, "booker_id", "json");
            this.putQueryParameter("booker_id", bookerIdShrink);
            this.bookerId = bookerId;
            return this;
        }

        /**
         * end_date.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("end_date", endDate);
            this.endDate = endDate;
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
         * scroll_id.
         */
        public Builder scrollId(String scrollId) {
            this.putQueryParameter("scroll_id", scrollId);
            this.scrollId = scrollId;
            return this;
        }

        /**
         * start_date.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("start_date", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * third_part_apply_id_list.
         */
        public Builder thirdPartApplyIdList(java.util.List < String > thirdPartApplyIdList) {
            String thirdPartApplyIdListShrink = shrink(thirdPartApplyIdList, "third_part_apply_id_list", "json");
            this.putQueryParameter("third_part_apply_id_list", thirdPartApplyIdListShrink);
            this.thirdPartApplyIdList = thirdPartApplyIdList;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public IFlightOrderListQueryRequest build() {
            return new IFlightOrderListQueryRequest(this);
        } 

    } 

}
