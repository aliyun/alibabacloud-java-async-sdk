// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CarApplyAddRequest} extends {@link RequestModel}
 *
 * <p>CarApplyAddRequest</p>
 */
public class CarApplyAddRequest extends Request {
    @Body
    @NameInMap("cause")
    @Validation(required = true)
    private String cause;

    @Body
    @NameInMap("city")
    @Validation(required = true)
    private String city;

    @Body
    @NameInMap("date")
    @Validation(required = true)
    private String date;

    @Body
    @NameInMap("finished_date")
    private String finishedDate;

    @Body
    @NameInMap("project_code")
    private String projectCode;

    @Body
    @NameInMap("project_name")
    private String projectName;

    @Body
    @NameInMap("status")
    @Validation(required = true)
    private Integer status;

    @Body
    @NameInMap("third_part_apply_id")
    @Validation(required = true)
    private String thirdPartApplyId;

    @Body
    @NameInMap("third_part_cost_center_id")
    @Validation(required = true)
    private String thirdPartCostCenterId;

    @Body
    @NameInMap("third_part_invoice_id")
    @Validation(required = true)
    private String thirdPartInvoiceId;

    @Body
    @NameInMap("times_total")
    @Validation(required = true)
    private Integer timesTotal;

    @Body
    @NameInMap("times_type")
    @Validation(required = true)
    private Integer timesType;

    @Body
    @NameInMap("times_used")
    @Validation(required = true)
    private Integer timesUsed;

    @Body
    @NameInMap("title")
    @Validation(required = true)
    private String title;

    @Body
    @NameInMap("user_id")
    @Validation(required = true)
    private String userId;

    private CarApplyAddRequest(Builder builder) {
        super(builder);
        this.cause = builder.cause;
        this.city = builder.city;
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
        this.userId = builder.userId;
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CarApplyAddRequest, Builder> {
        private String cause; 
        private String city; 
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
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CarApplyAddRequest request) {
            super(request);
            this.cause = request.cause;
            this.city = request.city;
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
            this.userId = request.userId;
        } 

        /**
         * 出差事由
         */
        public Builder cause(String cause) {
            this.putBodyParameter("cause", cause);
            this.cause = cause;
            return this;
        }

        /**
         * 用车城市
         */
        public Builder city(String city) {
            this.putBodyParameter("city", city);
            this.city = city;
            return this;
        }

        /**
         * 用车时间
         */
        public Builder date(String date) {
            this.putBodyParameter("date", date);
            this.date = date;
            return this;
        }

        /**
         * 用车结束时间，为null时取date
         */
        public Builder finishedDate(String finishedDate) {
            this.putBodyParameter("finished_date", finishedDate);
            this.finishedDate = finishedDate;
            return this;
        }

        /**
         * 审批单关联的项目code
         */
        public Builder projectCode(String projectCode) {
            this.putBodyParameter("project_code", projectCode);
            this.projectCode = projectCode;
            return this;
        }

        /**
         * 审批单关联的项目名
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("project_name", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * 0申请 1同意 2拒绝 3转交 4取消 5 修改已同意 6 撤销已同意 7 修改审批中 8 已同意(修改被拒绝)  9 撤销审批中n10 已同意(撤销被拒绝) 11 已同意(修改被取消) 12 已同意(撤销被取消)
         */
        public Builder status(Integer status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * 三方审批单ID
         */
        public Builder thirdPartApplyId(String thirdPartApplyId) {
            this.putBodyParameter("third_part_apply_id", thirdPartApplyId);
            this.thirdPartApplyId = thirdPartApplyId;
            return this;
        }

        /**
         * 审批单关联的三方成本中心ID
         */
        public Builder thirdPartCostCenterId(String thirdPartCostCenterId) {
            this.putBodyParameter("third_part_cost_center_id", thirdPartCostCenterId);
            this.thirdPartCostCenterId = thirdPartCostCenterId;
            return this;
        }

        /**
         * 审批单关联的三方发票抬头ID
         */
        public Builder thirdPartInvoiceId(String thirdPartInvoiceId) {
            this.putBodyParameter("third_part_invoice_id", thirdPartInvoiceId);
            this.thirdPartInvoiceId = thirdPartInvoiceId;
            return this;
        }

        /**
         * 申请单可用总次数
         */
        public Builder timesTotal(Integer timesTotal) {
            this.putBodyParameter("times_total", timesTotal);
            this.timesTotal = timesTotal;
            return this;
        }

        /**
         * 次数类型 1:次数不限制 2、用户可指定次数 3、管理员限制次数
         */
        public Builder timesType(Integer timesType) {
            this.putBodyParameter("times_type", timesType);
            this.timesType = timesType;
            return this;
        }

        /**
         * 申请单已用次数
         */
        public Builder timesUsed(Integer timesUsed) {
            this.putBodyParameter("times_used", timesUsed);
            this.timesUsed = timesUsed;
            return this;
        }

        /**
         * 审批单标题
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * 无userId时传缺省值superAdmin
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CarApplyAddRequest build() {
            return new CarApplyAddRequest(this);
        } 

    } 

}
