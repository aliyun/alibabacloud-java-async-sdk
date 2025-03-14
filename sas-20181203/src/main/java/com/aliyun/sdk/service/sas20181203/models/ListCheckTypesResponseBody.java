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
 * {@link ListCheckTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCheckTypesResponseBody</p>
 */
public class ListCheckTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCheckTypesResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckTypesResponseBody create() {
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
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private String code; 
        private Integer count; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListCheckTypesResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D65AADFC-1D20-5A6A-8F6A-9FA53C0D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCheckTypesResponseBody build() {
            return new ListCheckTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCheckTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckTypesResponseBody</p>
     */
    public static class CheckDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffiliatedRiskTypes")
        private java.util.List<String> affiliatedRiskTypes;

        @com.aliyun.core.annotation.NameInMap("AffiliatedRisks")
        private java.util.List<String> affiliatedRisks;

        @com.aliyun.core.annotation.NameInMap("CheckId")
        private Long checkId;

        @com.aliyun.core.annotation.NameInMap("CheckItem")
        private String checkItem;

        private CheckDetails(Builder builder) {
            this.affiliatedRiskTypes = builder.affiliatedRiskTypes;
            this.affiliatedRisks = builder.affiliatedRisks;
            this.checkId = builder.checkId;
            this.checkItem = builder.checkItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckDetails create() {
            return builder().build();
        }

        /**
         * @return affiliatedRiskTypes
         */
        public java.util.List<String> getAffiliatedRiskTypes() {
            return this.affiliatedRiskTypes;
        }

        /**
         * @return affiliatedRisks
         */
        public java.util.List<String> getAffiliatedRisks() {
            return this.affiliatedRisks;
        }

        /**
         * @return checkId
         */
        public Long getCheckId() {
            return this.checkId;
        }

        /**
         * @return checkItem
         */
        public String getCheckItem() {
            return this.checkItem;
        }

        public static final class Builder {
            private java.util.List<String> affiliatedRiskTypes; 
            private java.util.List<String> affiliatedRisks; 
            private Long checkId; 
            private String checkItem; 

            private Builder() {
            } 

            private Builder(CheckDetails model) {
                this.affiliatedRiskTypes = model.affiliatedRiskTypes;
                this.affiliatedRisks = model.affiliatedRisks;
                this.checkId = model.checkId;
                this.checkItem = model.checkItem;
            } 

            /**
             * <p>The list of the baseline categories of attribution.</p>
             */
            public Builder affiliatedRiskTypes(java.util.List<String> affiliatedRiskTypes) {
                this.affiliatedRiskTypes = affiliatedRiskTypes;
                return this;
            }

            /**
             * <p>The list of baselines attribution.</p>
             */
            public Builder affiliatedRisks(java.util.List<String> affiliatedRisks) {
                this.affiliatedRisks = affiliatedRisks;
                return this;
            }

            /**
             * <p>The ID of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>31</p>
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * <p>The description of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Configure the idle session timeout period.</p>
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            public CheckDetails build() {
                return new CheckDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCheckTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckTypesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckDetails")
        private java.util.List<CheckDetails> checkDetails;

        @com.aliyun.core.annotation.NameInMap("CheckType")
        private String checkType;

        @com.aliyun.core.annotation.NameInMap("CheckTypeDisName")
        private String checkTypeDisName;

        private Data(Builder builder) {
            this.checkDetails = builder.checkDetails;
            this.checkType = builder.checkType;
            this.checkTypeDisName = builder.checkTypeDisName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return checkDetails
         */
        public java.util.List<CheckDetails> getCheckDetails() {
            return this.checkDetails;
        }

        /**
         * @return checkType
         */
        public String getCheckType() {
            return this.checkType;
        }

        /**
         * @return checkTypeDisName
         */
        public String getCheckTypeDisName() {
            return this.checkTypeDisName;
        }

        public static final class Builder {
            private java.util.List<CheckDetails> checkDetails; 
            private String checkType; 
            private String checkTypeDisName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.checkDetails = model.checkDetails;
                this.checkType = model.checkType;
                this.checkTypeDisName = model.checkTypeDisName;
            } 

            /**
             * <p>The detail of check items.</p>
             */
            public Builder checkDetails(java.util.List<CheckDetails> checkDetails) {
                this.checkDetails = checkDetails;
                return this;
            }

            /**
             * <p>The type of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>data_integrity</p>
             */
            public Builder checkType(String checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * <p>The display name of the check item type.</p>
             * 
             * <strong>example:</strong>
             * <p>Data Integrity</p>
             */
            public Builder checkTypeDisName(String checkTypeDisName) {
                this.checkTypeDisName = checkTypeDisName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
