// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CarApplyAddRequest} extends {@link RequestModel}
 *
 * <p>CarApplyAddRequest</p>
 */
public class CarApplyAddRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cause")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cause;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("city")
    @com.aliyun.core.annotation.Validation(required = true)
    private String city;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("city_code_set")
    private String cityCodeSet;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String date;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("finished_date")
    private String finishedDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("project_code")
    private String projectCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("project_name")
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_part_apply_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdPartApplyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_part_cost_center_id")
    private String thirdPartCostCenterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_part_invoice_id")
    private String thirdPartInvoiceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("times_total")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer timesTotal;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("times_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer timesType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("times_used")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer timesUsed;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("traveler_standard")
    private java.util.List<TravelerStandard> travelerStandard;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private CarApplyAddRequest(Builder builder) {
        super(builder);
        this.cause = builder.cause;
        this.city = builder.city;
        this.cityCodeSet = builder.cityCodeSet;
        this.date = builder.date;
        this.finishedDate = builder.finishedDate;
        this.projectCode = builder.projectCode;
        this.projectName = builder.projectName;
        this.status = builder.status;
        this.thirdPartApplyId = builder.thirdPartApplyId;
        this.thirdPartCostCenterId = builder.thirdPartCostCenterId;
        this.thirdPartInvoiceId = builder.thirdPartInvoiceId;
        this.timesTotal = builder.timesTotal;
        this.timesType = builder.timesType;
        this.timesUsed = builder.timesUsed;
        this.title = builder.title;
        this.travelerStandard = builder.travelerStandard;
        this.userId = builder.userId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CarApplyAddRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cause
     */
    public String getCause() {
        return this.cause;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return cityCodeSet
     */
    public String getCityCodeSet() {
        return this.cityCodeSet;
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * @return finishedDate
     */
    public String getFinishedDate() {
        return this.finishedDate;
    }

    /**
     * @return projectCode
     */
    public String getProjectCode() {
        return this.projectCode;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return thirdPartApplyId
     */
    public String getThirdPartApplyId() {
        return this.thirdPartApplyId;
    }

    /**
     * @return thirdPartCostCenterId
     */
    public String getThirdPartCostCenterId() {
        return this.thirdPartCostCenterId;
    }

    /**
     * @return thirdPartInvoiceId
     */
    public String getThirdPartInvoiceId() {
        return this.thirdPartInvoiceId;
    }

    /**
     * @return timesTotal
     */
    public Integer getTimesTotal() {
        return this.timesTotal;
    }

    /**
     * @return timesType
     */
    public Integer getTimesType() {
        return this.timesType;
    }

    /**
     * @return timesUsed
     */
    public Integer getTimesUsed() {
        return this.timesUsed;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return travelerStandard
     */
    public java.util.List<TravelerStandard> getTravelerStandard() {
        return this.travelerStandard;
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

    public static final class Builder extends Request.Builder<CarApplyAddRequest, Builder> {
        private String cause; 
        private String city; 
        private String cityCodeSet; 
        private String date; 
        private String finishedDate; 
        private String projectCode; 
        private String projectName; 
        private Integer status; 
        private String thirdPartApplyId; 
        private String thirdPartCostCenterId; 
        private String thirdPartInvoiceId; 
        private Integer timesTotal; 
        private Integer timesType; 
        private Integer timesUsed; 
        private String title; 
        private java.util.List<TravelerStandard> travelerStandard; 
        private String userId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(CarApplyAddRequest request) {
            super(request);
            this.cause = request.cause;
            this.city = request.city;
            this.cityCodeSet = request.cityCodeSet;
            this.date = request.date;
            this.finishedDate = request.finishedDate;
            this.projectCode = request.projectCode;
            this.projectName = request.projectName;
            this.status = request.status;
            this.thirdPartApplyId = request.thirdPartApplyId;
            this.thirdPartCostCenterId = request.thirdPartCostCenterId;
            this.thirdPartInvoiceId = request.thirdPartInvoiceId;
            this.timesTotal = request.timesTotal;
            this.timesType = request.timesType;
            this.timesUsed = request.timesUsed;
            this.title = request.title;
            this.travelerStandard = request.travelerStandard;
            this.userId = request.userId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder cause(String cause) {
            this.putBodyParameter("cause", cause);
            this.cause = cause;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder city(String city) {
            this.putBodyParameter("city", city);
            this.city = city;
            return this;
        }

        /**
         * city_code_set.
         */
        public Builder cityCodeSet(String cityCodeSet) {
            this.putBodyParameter("city_code_set", cityCodeSet);
            this.cityCodeSet = cityCodeSet;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12 14:52:52</p>
         */
        public Builder date(String date) {
            this.putBodyParameter("date", date);
            this.date = date;
            return this;
        }

        /**
         * finished_date.
         */
        public Builder finishedDate(String finishedDate) {
            this.putBodyParameter("finished_date", finishedDate);
            this.finishedDate = finishedDate;
            return this;
        }

        /**
         * project_code.
         */
        public Builder projectCode(String projectCode) {
            this.putBodyParameter("project_code", projectCode);
            this.projectCode = projectCode;
            return this;
        }

        /**
         * project_name.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("project_name", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IRGS1413</p>
         */
        public Builder thirdPartApplyId(String thirdPartApplyId) {
            this.putBodyParameter("third_part_apply_id", thirdPartApplyId);
            this.thirdPartApplyId = thirdPartApplyId;
            return this;
        }

        /**
         * third_part_cost_center_id.
         */
        public Builder thirdPartCostCenterId(String thirdPartCostCenterId) {
            this.putBodyParameter("third_part_cost_center_id", thirdPartCostCenterId);
            this.thirdPartCostCenterId = thirdPartCostCenterId;
            return this;
        }

        /**
         * third_part_invoice_id.
         */
        public Builder thirdPartInvoiceId(String thirdPartInvoiceId) {
            this.putBodyParameter("third_part_invoice_id", thirdPartInvoiceId);
            this.thirdPartInvoiceId = thirdPartInvoiceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timesTotal(Integer timesTotal) {
            this.putBodyParameter("times_total", timesTotal);
            this.timesTotal = timesTotal;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timesType(Integer timesType) {
            this.putBodyParameter("times_type", timesType);
            this.timesType = timesType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timesUsed(Integer timesUsed) {
            this.putBodyParameter("times_used", timesUsed);
            this.timesUsed = timesUsed;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * traveler_standard.
         */
        public Builder travelerStandard(java.util.List<TravelerStandard> travelerStandard) {
            String travelerStandardShrink = shrink(travelerStandard, "traveler_standard", "json");
            this.putBodyParameter("traveler_standard", travelerStandardShrink);
            this.travelerStandard = travelerStandard;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN1415614</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
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
        public CarApplyAddRequest build() {
            return new CarApplyAddRequest(this);
        } 

    } 

    /**
     * 
     * {@link CarApplyAddRequest} extends {@link TeaModel}
     *
     * <p>CarApplyAddRequest</p>
     */
    public static class CarCitySet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("city_code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String cityName;

        private CarCitySet(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CarCitySet create() {
            return builder().build();
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        public static final class Builder {
            private String cityCode; 
            private String cityName; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            public CarCitySet build() {
                return new CarCitySet(this);
            } 

        } 

    }
    /**
     * 
     * {@link CarApplyAddRequest} extends {@link TeaModel}
     *
     * <p>CarApplyAddRequest</p>
     */
    public static class TravelerStandard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("car_city_set")
        private java.util.List<CarCitySet> carCitySet;

        @com.aliyun.core.annotation.NameInMap("user_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        private TravelerStandard(Builder builder) {
            this.carCitySet = builder.carCitySet;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TravelerStandard create() {
            return builder().build();
        }

        /**
         * @return carCitySet
         */
        public java.util.List<CarCitySet> getCarCitySet() {
            return this.carCitySet;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List<CarCitySet> carCitySet; 
            private String userId; 

            /**
             * car_city_set.
             */
            public Builder carCitySet(java.util.List<CarCitySet> carCitySet) {
                this.carCitySet = carCitySet;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TravelerStandard build() {
                return new TravelerStandard(this);
            } 

        } 

    }
}
