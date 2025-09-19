// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeSoarSubscribedStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSoarSubscribedStrategyResponseBody</p>
 */
public class DescribeSoarSubscribedStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SoarStrategies")
    private java.util.List<SoarStrategies> soarStrategies;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSoarSubscribedStrategyResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.soarStrategies = builder.soarStrategies;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarSubscribedStrategyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return soarStrategies
     */
    public java.util.List<SoarStrategies> getSoarStrategies() {
        return this.soarStrategies;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<SoarStrategies> soarStrategies; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSoarSubscribedStrategyResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.soarStrategies = model.soarStrategies;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number. Pages start from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0B48AB3C-84FC-424D-A01D-B9270EF46038</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The policies.</p>
         */
        public Builder soarStrategies(java.util.List<SoarStrategies> soarStrategies) {
            this.soarStrategies = soarStrategies;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSoarSubscribedStrategyResponseBody build() {
            return new DescribeSoarSubscribedStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSoarSubscribedStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSoarSubscribedStrategyResponseBody</p>
     */
    public static class SoarStrategies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExecuteNum")
        private String executeNum;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RunMode")
        private String runMode;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SoarStrategies(Builder builder) {
            this.creator = builder.creator;
            this.description = builder.description;
            this.executeNum = builder.executeNum;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.runMode = builder.runMode;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoarStrategies create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return executeNum
         */
        public String getExecuteNum() {
            return this.executeNum;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return runMode
         */
        public String getRunMode() {
            return this.runMode;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String creator; 
            private String description; 
            private String executeNum; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String name; 
            private String runMode; 
            private String type; 

            private Builder() {
            } 

            private Builder(SoarStrategies model) {
                this.creator = model.creator;
                this.description = model.description;
                this.executeNum = model.executeNum;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.name = model.name;
                this.runMode = model.runMode;
                this.type = model.type;
            } 

            /**
             * <p>The Alibaba Cloud account ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>1276085*****4392</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The description of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>strategy_description_01</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The total number of times that the policy is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder executeNum(String executeNum) {
                this.executeNum = executeNum;
                return this;
            }

            /**
             * <p>The timestamp when the policy was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1716344106000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The timestamp when the policy was modified. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1652672104000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>300063</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>strategy_name01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The execution mode. Valid values:</p>
             * <ul>
             * <li>runmode_TRIGGER_BY_USER: manually executed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>runmode_TRIGGER_BY_USER</p>
             */
            public Builder runMode(String runMode) {
                this.runMode = runMode;
                return this;
            }

            /**
             * <p>The type of the policy. Valid values:</p>
             * <ul>
             * <li>type_vulfix: vulnerability operations</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>type_vulfix</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SoarStrategies build() {
                return new SoarStrategies(this);
            } 

        } 

    }
}
