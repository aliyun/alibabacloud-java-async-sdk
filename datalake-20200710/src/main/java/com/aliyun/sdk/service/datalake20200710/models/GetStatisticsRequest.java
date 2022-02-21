// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetStatisticsRequest</p>
 */
public class GetStatisticsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("singleIndicatorList")
    private java.util.List < SingleIndicatorList> singleIndicatorList;

    private GetStatisticsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.singleIndicatorList = builder.singleIndicatorList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStatisticsRequest create() {
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
     * @return singleIndicatorList
     */
    public java.util.List < SingleIndicatorList> getSingleIndicatorList() {
        return this.singleIndicatorList;
    }

    public static final class Builder extends Request.Builder<GetStatisticsRequest, Builder> {
        private String regionId; 
        private java.util.List < SingleIndicatorList> singleIndicatorList; 

        private Builder() {
            super();
        } 

        private Builder(GetStatisticsRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.singleIndicatorList = response.singleIndicatorList;
        } 

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * singleIndicatorList.
         */
        public Builder singleIndicatorList(java.util.List < SingleIndicatorList> singleIndicatorList) {
            this.putBodyParameter("singleIndicatorList", singleIndicatorList);
            this.singleIndicatorList = singleIndicatorList;
            return this;
        }

        @Override
        public GetStatisticsRequest build() {
            return new GetStatisticsRequest(this);
        } 

    } 

    public static class SingleIndicatorList extends TeaModel {
        @NameInMap("indicatorCode")
        private String indicatorCode;

        @NameInMap("indicatorTypes")
        private java.util.List < String > indicatorTypes;

        private SingleIndicatorList(Builder builder) {
            this.indicatorCode = builder.indicatorCode;
            this.indicatorTypes = builder.indicatorTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SingleIndicatorList create() {
            return builder().build();
        }

        /**
         * @return indicatorCode
         */
        public String getIndicatorCode() {
            return this.indicatorCode;
        }

        /**
         * @return indicatorTypes
         */
        public java.util.List < String > getIndicatorTypes() {
            return this.indicatorTypes;
        }

        public static final class Builder {
            private String indicatorCode; 
            private java.util.List < String > indicatorTypes; 

            /**
             * indicatorCode.
             */
            public Builder indicatorCode(String indicatorCode) {
                this.indicatorCode = indicatorCode;
                return this;
            }

            /**
             * indicatorTypes.
             */
            public Builder indicatorTypes(java.util.List < String > indicatorTypes) {
                this.indicatorTypes = indicatorTypes;
                return this;
            }

            public SingleIndicatorList build() {
                return new SingleIndicatorList(this);
            } 

        } 

    }
}
