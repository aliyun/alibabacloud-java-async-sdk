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
 * {@link DepartmentSaveRequest} extends {@link RequestModel}
 *
 * <p>DepartmentSaveRequest</p>
 */
public class DepartmentSaveRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("depart_list")
    private java.util.List<DepartList> departList;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private DepartmentSaveRequest(Builder builder) {
        super(builder);
        this.departList = builder.departList;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DepartmentSaveRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return departList
     */
    public java.util.List<DepartList> getDepartList() {
        return this.departList;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<DepartmentSaveRequest, Builder> {
        private java.util.List<DepartList> departList; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(DepartmentSaveRequest request) {
            super(request);
            this.departList = request.departList;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * depart_list.
         */
        public Builder departList(java.util.List<DepartList> departList) {
            String departListShrink = shrink(departList, "depart_list", "json");
            this.putBodyParameter("depart_list", departListShrink);
            this.departList = departList;
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
        public DepartmentSaveRequest build() {
            return new DepartmentSaveRequest(this);
        } 

    } 

    /**
     * 
     * {@link DepartmentSaveRequest} extends {@link TeaModel}
     *
     * <p>DepartmentSaveRequest</p>
     */
    public static class DepartList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("depart_id")
        private Long departId;

        @com.aliyun.core.annotation.NameInMap("depart_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String departName;

        @com.aliyun.core.annotation.NameInMap("depart_pid")
        private Long departPid;

        @com.aliyun.core.annotation.NameInMap("manager_ids")
        private String managerIds;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("third_depart_id")
        private String thirdDepartId;

        @com.aliyun.core.annotation.NameInMap("third_depart_pid")
        private String thirdDepartPid;

        private DepartList(Builder builder) {
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.departPid = builder.departPid;
            this.managerIds = builder.managerIds;
            this.status = builder.status;
            this.thirdDepartId = builder.thirdDepartId;
            this.thirdDepartPid = builder.thirdDepartPid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DepartList create() {
            return builder().build();
        }

        /**
         * @return departId
         */
        public Long getDepartId() {
            return this.departId;
        }

        /**
         * @return departName
         */
        public String getDepartName() {
            return this.departName;
        }

        /**
         * @return departPid
         */
        public Long getDepartPid() {
            return this.departPid;
        }

        /**
         * @return managerIds
         */
        public String getManagerIds() {
            return this.managerIds;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return thirdDepartId
         */
        public String getThirdDepartId() {
            return this.thirdDepartId;
        }

        /**
         * @return thirdDepartPid
         */
        public String getThirdDepartPid() {
            return this.thirdDepartPid;
        }

        public static final class Builder {
            private Long departId; 
            private String departName; 
            private Long departPid; 
            private String managerIds; 
            private Integer status; 
            private String thirdDepartId; 
            private String thirdDepartPid; 

            private Builder() {
            } 

            private Builder(DepartList model) {
                this.departId = model.departId;
                this.departName = model.departName;
                this.departPid = model.departPid;
                this.managerIds = model.managerIds;
                this.status = model.status;
                this.thirdDepartId = model.thirdDepartId;
                this.thirdDepartPid = model.thirdDepartPid;
            } 

            /**
             * depart_id.
             */
            public Builder departId(Long departId) {
                this.departId = departId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder departName(String departName) {
                this.departName = departName;
                return this;
            }

            /**
             * depart_pid.
             */
            public Builder departPid(Long departPid) {
                this.departPid = departPid;
                return this;
            }

            /**
             * manager_ids.
             */
            public Builder managerIds(String managerIds) {
                this.managerIds = managerIds;
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
             * third_depart_id.
             */
            public Builder thirdDepartId(String thirdDepartId) {
                this.thirdDepartId = thirdDepartId;
                return this;
            }

            /**
             * third_depart_pid.
             */
            public Builder thirdDepartPid(String thirdDepartPid) {
                this.thirdDepartPid = thirdDepartPid;
                return this;
            }

            public DepartList build() {
                return new DepartList(this);
            } 

        } 

    }
}
