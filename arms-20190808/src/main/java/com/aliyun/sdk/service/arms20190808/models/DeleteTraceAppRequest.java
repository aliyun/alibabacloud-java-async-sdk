// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteTraceAppRequest} extends {@link RequestModel}
 *
 * <p>DeleteTraceAppRequest</p>
 */
public class DeleteTraceAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteReason")
    private DeleteReason deleteReason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DeleteTraceAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.deleteReason = builder.deleteReason;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTraceAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return deleteReason
     */
    public DeleteReason getDeleteReason() {
        return this.deleteReason;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DeleteTraceAppRequest, Builder> {
        private String appId; 
        private DeleteReason deleteReason; 
        private String pid; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTraceAppRequest request) {
            super(request);
            this.appId = request.appId;
            this.deleteReason = request.deleteReason;
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the application that you want to delete. You can call the SearchTraceAppByName operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/130676.html">SearchTraceAppByName</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5406**</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The reason(s) to delete application.</p>
         */
        public Builder deleteReason(DeleteReason deleteReason) {
            String deleteReasonShrink = shrink(deleteReason, "DeleteReason", "json");
            this.putQueryParameter("DeleteReason", deleteReasonShrink);
            this.deleteReason = deleteReason;
            return this;
        }

        /**
         * <p>The PID of the application. For more information about how to query the PID, see <a href="https://www.alibabacloud.com/help/zh/doc-detail/186100.htm?spm=a2cdw.13409063.0.0.7a72281f0bkTfx#title-imy-7gj-qhr">QueryMetricByPage</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9w0sc5gxxz@edcsd447c2f****</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * <p>The ID of the region in which the application is located.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type of the application that you want to delete. You can call the SearchTraceAppByName operation to query the application type. For more information, see <a href="https://help.aliyun.com/document_detail/130676.html">SearchTraceAppByName</a>. Valid values:</p>
         * <ul>
         * <li><code>TRACE</code>: Application Monitoring</li>
         * <li><code>RETCODE</code>: frontend monitoring</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TRACE</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DeleteTraceAppRequest build() {
            return new DeleteTraceAppRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteTraceAppRequest} extends {@link TeaModel}
     *
     * <p>DeleteTraceAppRequest</p>
     */
    public static class ReasonIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ReasonIds(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReasonIds create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer id; 
            private String name; 

            /**
             * <p>The ID of the reason for deletion.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>A description of the reason for removal.</p>
             * 
             * <strong>example:</strong>
             * <p>The function is not perfect, and the root cause of the problem cannot be located.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ReasonIds build() {
                return new ReasonIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteTraceAppRequest} extends {@link TeaModel}
     *
     * <p>DeleteTraceAppRequest</p>
     */
    public static class DeleteReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReasonIds")
        private java.util.List < ReasonIds> reasonIds;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private DeleteReason(Builder builder) {
            this.reasonIds = builder.reasonIds;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteReason create() {
            return builder().build();
        }

        /**
         * @return reasonIds
         */
        public java.util.List < ReasonIds> getReasonIds() {
            return this.reasonIds;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private java.util.List < ReasonIds> reasonIds; 
            private String remark; 

            /**
             * <p>Reasons Ids.</p>
             */
            public Builder reasonIds(java.util.List < ReasonIds> reasonIds) {
                this.reasonIds = reasonIds;
                return this;
            }

            /**
             * <p>Additional remarks when none of the reasons for removal provided are met.</p>
             * 
             * <strong>example:</strong>
             * <p>The business scenario cannot be satisfied.</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public DeleteReason build() {
                return new DeleteReason(this);
            } 

        } 

    }
}
