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
 * {@link MealApplyQueryResponseBody} extends {@link TeaModel}
 *
 * <p>MealApplyQueryResponseBody</p>
 */
public class MealApplyQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private MealApplyQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MealApplyQueryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(MealApplyQueryResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>210f07f316603757445272547d959f</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public MealApplyQueryResponseBody build() {
            return new MealApplyQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MealApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>MealApplyQueryResponseBody</p>
     */
    public static class ApplyUser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        private ApplyUser(Builder builder) {
            this.userId = builder.userId;
            this.userName = builder.userName;
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

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(ApplyUser model) {
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * user_name.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ApplyUser build() {
                return new ApplyUser(this);
            } 

        } 

    }
    /**
     * 
     * {@link MealApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>MealApplyQueryResponseBody</p>
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
     * {@link MealApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>MealApplyQueryResponseBody</p>
     */
    public static class ItineraryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cities")
        private java.util.List<Cities> cities;

        @com.aliyun.core.annotation.NameInMap("end_date")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("start_date")
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
             * cities.
             */
            public Builder cities(java.util.List<Cities> cities) {
                this.cities = cities;
                return this;
            }

            /**
             * end_date.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * start_date.
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
    /**
     * 
     * {@link MealApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>MealApplyQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_user")
        private ApplyUser applyUser;

        @com.aliyun.core.annotation.NameInMap("cost_center_id")
        private Long costCenterId;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("invoice_id")
        private Long invoiceId;

        @com.aliyun.core.annotation.NameInMap("itinerary_list")
        private java.util.List<ItineraryList> itineraryList;

        @com.aliyun.core.annotation.NameInMap("meal_amount")
        private Long mealAmount;

        @com.aliyun.core.annotation.NameInMap("meal_cause")
        private String mealCause;

        @com.aliyun.core.annotation.NameInMap("project_id")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("third_part_apply_id")
        private String thirdPartApplyId;

        @com.aliyun.core.annotation.NameInMap("third_part_cost_center_id")
        private String thirdPartCostCenterId;

        @com.aliyun.core.annotation.NameInMap("third_part_invoice_id")
        private String thirdPartInvoiceId;

        @com.aliyun.core.annotation.NameInMap("third_part_project_id")
        private String thirdPartProjectId;

        private Module(Builder builder) {
            this.applyUser = builder.applyUser;
            this.costCenterId = builder.costCenterId;
            this.gmtCreate = builder.gmtCreate;
            this.invoiceId = builder.invoiceId;
            this.itineraryList = builder.itineraryList;
            this.mealAmount = builder.mealAmount;
            this.mealCause = builder.mealCause;
            this.projectId = builder.projectId;
            this.status = builder.status;
            this.thirdPartApplyId = builder.thirdPartApplyId;
            this.thirdPartCostCenterId = builder.thirdPartCostCenterId;
            this.thirdPartInvoiceId = builder.thirdPartInvoiceId;
            this.thirdPartProjectId = builder.thirdPartProjectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
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
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
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
         * @return thirdPartProjectId
         */
        public String getThirdPartProjectId() {
            return this.thirdPartProjectId;
        }

        public static final class Builder {
            private ApplyUser applyUser; 
            private Long costCenterId; 
            private String gmtCreate; 
            private Long invoiceId; 
            private java.util.List<ItineraryList> itineraryList; 
            private Long mealAmount; 
            private String mealCause; 
            private Long projectId; 
            private Integer status; 
            private String thirdPartApplyId; 
            private String thirdPartCostCenterId; 
            private String thirdPartInvoiceId; 
            private String thirdPartProjectId; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.applyUser = model.applyUser;
                this.costCenterId = model.costCenterId;
                this.gmtCreate = model.gmtCreate;
                this.invoiceId = model.invoiceId;
                this.itineraryList = model.itineraryList;
                this.mealAmount = model.mealAmount;
                this.mealCause = model.mealCause;
                this.projectId = model.projectId;
                this.status = model.status;
                this.thirdPartApplyId = model.thirdPartApplyId;
                this.thirdPartCostCenterId = model.thirdPartCostCenterId;
                this.thirdPartInvoiceId = model.thirdPartInvoiceId;
                this.thirdPartProjectId = model.thirdPartProjectId;
            } 

            /**
             * apply_user.
             */
            public Builder applyUser(ApplyUser applyUser) {
                this.applyUser = applyUser;
                return this;
            }

            /**
             * cost_center_id.
             */
            public Builder costCenterId(Long costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * gmt_create.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * invoice_id.
             */
            public Builder invoiceId(Long invoiceId) {
                this.invoiceId = invoiceId;
                return this;
            }

            /**
             * itinerary_list.
             */
            public Builder itineraryList(java.util.List<ItineraryList> itineraryList) {
                this.itineraryList = itineraryList;
                return this;
            }

            /**
             * meal_amount.
             */
            public Builder mealAmount(Long mealAmount) {
                this.mealAmount = mealAmount;
                return this;
            }

            /**
             * meal_cause.
             */
            public Builder mealCause(String mealCause) {
                this.mealCause = mealCause;
                return this;
            }

            /**
             * project_id.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * third_part_apply_id.
             */
            public Builder thirdPartApplyId(String thirdPartApplyId) {
                this.thirdPartApplyId = thirdPartApplyId;
                return this;
            }

            /**
             * third_part_cost_center_id.
             */
            public Builder thirdPartCostCenterId(String thirdPartCostCenterId) {
                this.thirdPartCostCenterId = thirdPartCostCenterId;
                return this;
            }

            /**
             * third_part_invoice_id.
             */
            public Builder thirdPartInvoiceId(String thirdPartInvoiceId) {
                this.thirdPartInvoiceId = thirdPartInvoiceId;
                return this;
            }

            /**
             * third_part_project_id.
             */
            public Builder thirdPartProjectId(String thirdPartProjectId) {
                this.thirdPartProjectId = thirdPartProjectId;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
