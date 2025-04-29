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
 * {@link MealApplyAddRequest} extends {@link RequestModel}
 *
 * <p>MealApplyAddRequest</p>
 */
public class MealApplyAddRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("apply_user")
    @com.aliyun.core.annotation.Validation(required = true)
    private ApplyUser applyUser;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cost_center_id")
    private Long costCenterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("invoice_id")
    private Long invoiceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("itinerary_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ItineraryList> itineraryList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("meal_amount")
    private Long mealAmount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("meal_cause")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 50)
    private String mealCause;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("project_code")
    private String projectCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("project_title")
    private String projectTitle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_part_apply_id")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
    private String thirdPartApplyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_part_cost_center_id")
    private String thirdPartCostCenterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_part_invoice_id")
    private String thirdPartInvoiceId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private MealApplyAddRequest(Builder builder) {
        super(builder);
        this.applyUser = builder.applyUser;
        this.costCenterId = builder.costCenterId;
        this.invoiceId = builder.invoiceId;
        this.itineraryList = builder.itineraryList;
        this.mealAmount = builder.mealAmount;
        this.mealCause = builder.mealCause;
        this.projectCode = builder.projectCode;
        this.projectTitle = builder.projectTitle;
        this.status = builder.status;
        this.thirdPartApplyId = builder.thirdPartApplyId;
        this.thirdPartCostCenterId = builder.thirdPartCostCenterId;
        this.thirdPartInvoiceId = builder.thirdPartInvoiceId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MealApplyAddRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyUser
     */
    public ApplyUser getApplyUser() {
        return this.applyUser;
    }

    /**
     * @return costCenterId
     */
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    /**
     * @return invoiceId
     */
    public Long getInvoiceId() {
        return this.invoiceId;
    }

    /**
     * @return itineraryList
     */
    public java.util.List<ItineraryList> getItineraryList() {
        return this.itineraryList;
    }

    /**
     * @return mealAmount
     */
    public Long getMealAmount() {
        return this.mealAmount;
    }

    /**
     * @return mealCause
     */
    public String getMealCause() {
        return this.mealCause;
    }

    /**
     * @return projectCode
     */
    public String getProjectCode() {
        return this.projectCode;
    }

    /**
     * @return projectTitle
     */
    public String getProjectTitle() {
        return this.projectTitle;
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
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<MealApplyAddRequest, Builder> {
        private ApplyUser applyUser; 
        private Long costCenterId; 
        private Long invoiceId; 
        private java.util.List<ItineraryList> itineraryList; 
        private Long mealAmount; 
        private String mealCause; 
        private String projectCode; 
        private String projectTitle; 
        private Integer status; 
        private String thirdPartApplyId; 
        private String thirdPartCostCenterId; 
        private String thirdPartInvoiceId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(MealApplyAddRequest request) {
            super(request);
            this.applyUser = request.applyUser;
            this.costCenterId = request.costCenterId;
            this.invoiceId = request.invoiceId;
            this.itineraryList = request.itineraryList;
            this.mealAmount = request.mealAmount;
            this.mealCause = request.mealCause;
            this.projectCode = request.projectCode;
            this.projectTitle = request.projectTitle;
            this.status = request.status;
            this.thirdPartApplyId = request.thirdPartApplyId;
            this.thirdPartCostCenterId = request.thirdPartCostCenterId;
            this.thirdPartInvoiceId = request.thirdPartInvoiceId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder applyUser(ApplyUser applyUser) {
            String applyUserShrink = shrink(applyUser, "apply_user", "json");
            this.putBodyParameter("apply_user", applyUserShrink);
            this.applyUser = applyUser;
            return this;
        }

        /**
         * cost_center_id.
         */
        public Builder costCenterId(Long costCenterId) {
            this.putBodyParameter("cost_center_id", costCenterId);
            this.costCenterId = costCenterId;
            return this;
        }

        /**
         * invoice_id.
         */
        public Builder invoiceId(Long invoiceId) {
            this.putBodyParameter("invoice_id", invoiceId);
            this.invoiceId = invoiceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder itineraryList(java.util.List<ItineraryList> itineraryList) {
            String itineraryListShrink = shrink(itineraryList, "itinerary_list", "json");
            this.putBodyParameter("itinerary_list", itineraryListShrink);
            this.itineraryList = itineraryList;
            return this;
        }

        /**
         * meal_amount.
         */
        public Builder mealAmount(Long mealAmount) {
            this.putBodyParameter("meal_amount", mealAmount);
            this.mealAmount = mealAmount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder mealCause(String mealCause) {
            this.putBodyParameter("meal_cause", mealCause);
            this.mealCause = mealCause;
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
         * project_title.
         */
        public Builder projectTitle(String projectTitle) {
            this.putBodyParameter("project_title", projectTitle);
            this.projectTitle = projectTitle;
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
         * <p>1234</p>
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
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public MealApplyAddRequest build() {
            return new MealApplyAddRequest(this);
        } 

    } 

    /**
     * 
     * {@link MealApplyAddRequest} extends {@link TeaModel}
     *
     * <p>MealApplyAddRequest</p>
     */
    public static class ApplyUser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("user_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        private ApplyUser(Builder builder) {
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyUser create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String userId; 

            private Builder() {
            } 

            private Builder(ApplyUser model) {
                this.userId = model.userId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>userId1</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ApplyUser build() {
                return new ApplyUser(this);
            } 

        } 

    }
    /**
     * 
     * {@link MealApplyAddRequest} extends {@link TeaModel}
     *
     * <p>MealApplyAddRequest</p>
     */
    public static class Cities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        private Cities(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cities create() {
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

            private Builder() {
            } 

            private Builder(Cities model) {
                this.cityCode = model.cityCode;
                this.cityName = model.cityName;
            } 

            /**
             * city_code.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * city_name.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            public Cities build() {
                return new Cities(this);
            } 

        } 

    }
    /**
     * 
     * {@link MealApplyAddRequest} extends {@link TeaModel}
     *
     * <p>MealApplyAddRequest</p>
     */
    public static class ItineraryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cities")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Cities> cities;

        @com.aliyun.core.annotation.NameInMap("end_date")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("start_date")
        @com.aliyun.core.annotation.Validation(required = true)
        private String startDate;

        @com.aliyun.core.annotation.NameInMap("thirdpart_itinerary_id")
        private String thirdpartItineraryId;

        private ItineraryList(Builder builder) {
            this.cities = builder.cities;
            this.endDate = builder.endDate;
            this.startDate = builder.startDate;
            this.thirdpartItineraryId = builder.thirdpartItineraryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItineraryList create() {
            return builder().build();
        }

        /**
         * @return cities
         */
        public java.util.List<Cities> getCities() {
            return this.cities;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return thirdpartItineraryId
         */
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        public static final class Builder {
            private java.util.List<Cities> cities; 
            private String endDate; 
            private String startDate; 
            private String thirdpartItineraryId; 

            private Builder() {
            } 

            private Builder(ItineraryList model) {
                this.cities = model.cities;
                this.endDate = model.endDate;
                this.startDate = model.startDate;
                this.thirdpartItineraryId = model.thirdpartItineraryId;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder cities(java.util.List<Cities> cities) {
                this.cities = cities;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-02-05 00:00:00</p>
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-02-05 00:00:00</p>
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * thirdpart_itinerary_id.
             */
            public Builder thirdpartItineraryId(String thirdpartItineraryId) {
                this.thirdpartItineraryId = thirdpartItineraryId;
                return this;
            }

            public ItineraryList build() {
                return new ItineraryList(this);
            } 

        } 

    }
}
