// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20201214.models;

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
 * {@link SearchImageByTextResponseBody} extends {@link TeaModel}
 *
 * <p>SearchImageByTextResponseBody</p>
 */
public class SearchImageByTextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Auctions")
    private java.util.List<Auctions> auctions;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Head")
    private Head head;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("PicInfo")
    private PicInfo picInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SearchImageByTextResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.auctions = builder.auctions;
        this.code = builder.code;
        this.head = builder.head;
        this.msg = builder.msg;
        this.picInfo = builder.picInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchImageByTextResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return auctions
     */
    public java.util.List<Auctions> getAuctions() {
        return this.auctions;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return head
     */
    public Head getHead() {
        return this.head;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return picInfo
     */
    public PicInfo getPicInfo() {
        return this.picInfo;
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
        private AccessDeniedDetail accessDeniedDetail; 
        private java.util.List<Auctions> auctions; 
        private Integer code; 
        private Head head; 
        private String msg; 
        private PicInfo picInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SearchImageByTextResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.auctions = model.auctions;
            this.code = model.code;
            this.head = model.head;
            this.msg = model.msg;
            this.picInfo = model.picInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Auctions.
         */
        public Builder auctions(java.util.List<Auctions> auctions) {
            this.auctions = auctions;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Head.
         */
        public Builder head(Head head) {
            this.head = head;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * PicInfo.
         */
        public Builder picInfo(PicInfo picInfo) {
            this.picInfo = picInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SearchImageByTextResponseBody build() {
            return new SearchImageByTextResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchImageByTextResponseBody} extends {@link TeaModel}
     *
     * <p>SearchImageByTextResponseBody</p>
     */
    public static class AccessDeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalType")
        private String authPrincipalType;

        @com.aliyun.core.annotation.NameInMap("EncodedDiagnosticMessage")
        private String encodedDiagnosticMessage;

        @com.aliyun.core.annotation.NameInMap("NoPermissionType")
        private String noPermissionType;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private AccessDeniedDetail(Builder builder) {
            this.authAction = builder.authAction;
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
            this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDeniedDetail create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        /**
         * @return encodedDiagnosticMessage
         */
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String authAction; 
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            private Builder() {
            } 

            private Builder(AccessDeniedDetail model) {
                this.authAction = model.authAction;
                this.authPrincipalDisplayName = model.authPrincipalDisplayName;
                this.authPrincipalOwnerId = model.authPrincipalOwnerId;
                this.authPrincipalType = model.authPrincipalType;
                this.encodedDiagnosticMessage = model.encodedDiagnosticMessage;
                this.noPermissionType = model.noPermissionType;
                this.policyType = model.policyType;
            } 

            /**
             * AuthAction.
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * AuthPrincipalDisplayName.
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * AuthPrincipalOwnerId.
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * AuthPrincipalType.
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * EncodedDiagnosticMessage.
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * NoPermissionType.
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public AccessDeniedDetail build() {
                return new AccessDeniedDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchImageByTextResponseBody} extends {@link TeaModel}
     *
     * <p>SearchImageByTextResponseBody</p>
     */
    public static class Auctions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Integer categoryId;

        @com.aliyun.core.annotation.NameInMap("CustomContent")
        private String customContent;

        @com.aliyun.core.annotation.NameInMap("IntAttr")
        private Integer intAttr;

        @com.aliyun.core.annotation.NameInMap("IntAttr2")
        private Integer intAttr2;

        @com.aliyun.core.annotation.NameInMap("IntAttr3")
        private Integer intAttr3;

        @com.aliyun.core.annotation.NameInMap("IntAttr4")
        private Integer intAttr4;

        @com.aliyun.core.annotation.NameInMap("PicName")
        private String picName;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("StrAttr")
        private String strAttr;

        @com.aliyun.core.annotation.NameInMap("StrAttr2")
        private String strAttr2;

        @com.aliyun.core.annotation.NameInMap("StrAttr3")
        private String strAttr3;

        @com.aliyun.core.annotation.NameInMap("StrAttr4")
        private String strAttr4;

        private Auctions(Builder builder) {
            this.categoryId = builder.categoryId;
            this.customContent = builder.customContent;
            this.intAttr = builder.intAttr;
            this.intAttr2 = builder.intAttr2;
            this.intAttr3 = builder.intAttr3;
            this.intAttr4 = builder.intAttr4;
            this.picName = builder.picName;
            this.productId = builder.productId;
            this.score = builder.score;
            this.strAttr = builder.strAttr;
            this.strAttr2 = builder.strAttr2;
            this.strAttr3 = builder.strAttr3;
            this.strAttr4 = builder.strAttr4;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Auctions create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Integer getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return customContent
         */
        public String getCustomContent() {
            return this.customContent;
        }

        /**
         * @return intAttr
         */
        public Integer getIntAttr() {
            return this.intAttr;
        }

        /**
         * @return intAttr2
         */
        public Integer getIntAttr2() {
            return this.intAttr2;
        }

        /**
         * @return intAttr3
         */
        public Integer getIntAttr3() {
            return this.intAttr3;
        }

        /**
         * @return intAttr4
         */
        public Integer getIntAttr4() {
            return this.intAttr4;
        }

        /**
         * @return picName
         */
        public String getPicName() {
            return this.picName;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        /**
         * @return strAttr
         */
        public String getStrAttr() {
            return this.strAttr;
        }

        /**
         * @return strAttr2
         */
        public String getStrAttr2() {
            return this.strAttr2;
        }

        /**
         * @return strAttr3
         */
        public String getStrAttr3() {
            return this.strAttr3;
        }

        /**
         * @return strAttr4
         */
        public String getStrAttr4() {
            return this.strAttr4;
        }

        public static final class Builder {
            private Integer categoryId; 
            private String customContent; 
            private Integer intAttr; 
            private Integer intAttr2; 
            private Integer intAttr3; 
            private Integer intAttr4; 
            private String picName; 
            private String productId; 
            private Float score; 
            private String strAttr; 
            private String strAttr2; 
            private String strAttr3; 
            private String strAttr4; 

            private Builder() {
            } 

            private Builder(Auctions model) {
                this.categoryId = model.categoryId;
                this.customContent = model.customContent;
                this.intAttr = model.intAttr;
                this.intAttr2 = model.intAttr2;
                this.intAttr3 = model.intAttr3;
                this.intAttr4 = model.intAttr4;
                this.picName = model.picName;
                this.productId = model.productId;
                this.score = model.score;
                this.strAttr = model.strAttr;
                this.strAttr2 = model.strAttr2;
                this.strAttr3 = model.strAttr3;
                this.strAttr4 = model.strAttr4;
            } 

            /**
             * CategoryId.
             */
            public Builder categoryId(Integer categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CustomContent.
             */
            public Builder customContent(String customContent) {
                this.customContent = customContent;
                return this;
            }

            /**
             * IntAttr.
             */
            public Builder intAttr(Integer intAttr) {
                this.intAttr = intAttr;
                return this;
            }

            /**
             * IntAttr2.
             */
            public Builder intAttr2(Integer intAttr2) {
                this.intAttr2 = intAttr2;
                return this;
            }

            /**
             * IntAttr3.
             */
            public Builder intAttr3(Integer intAttr3) {
                this.intAttr3 = intAttr3;
                return this;
            }

            /**
             * IntAttr4.
             */
            public Builder intAttr4(Integer intAttr4) {
                this.intAttr4 = intAttr4;
                return this;
            }

            /**
             * PicName.
             */
            public Builder picName(String picName) {
                this.picName = picName;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * StrAttr.
             */
            public Builder strAttr(String strAttr) {
                this.strAttr = strAttr;
                return this;
            }

            /**
             * StrAttr2.
             */
            public Builder strAttr2(String strAttr2) {
                this.strAttr2 = strAttr2;
                return this;
            }

            /**
             * StrAttr3.
             */
            public Builder strAttr3(String strAttr3) {
                this.strAttr3 = strAttr3;
                return this;
            }

            /**
             * StrAttr4.
             */
            public Builder strAttr4(String strAttr4) {
                this.strAttr4 = strAttr4;
                return this;
            }

            public Auctions build() {
                return new Auctions(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchImageByTextResponseBody} extends {@link TeaModel}
     *
     * <p>SearchImageByTextResponseBody</p>
     */
    public static class Head extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocsFound")
        private Integer docsFound;

        @com.aliyun.core.annotation.NameInMap("DocsReturn")
        private Integer docsReturn;

        @com.aliyun.core.annotation.NameInMap("SearchTime")
        private Integer searchTime;

        private Head(Builder builder) {
            this.docsFound = builder.docsFound;
            this.docsReturn = builder.docsReturn;
            this.searchTime = builder.searchTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Head create() {
            return builder().build();
        }

        /**
         * @return docsFound
         */
        public Integer getDocsFound() {
            return this.docsFound;
        }

        /**
         * @return docsReturn
         */
        public Integer getDocsReturn() {
            return this.docsReturn;
        }

        /**
         * @return searchTime
         */
        public Integer getSearchTime() {
            return this.searchTime;
        }

        public static final class Builder {
            private Integer docsFound; 
            private Integer docsReturn; 
            private Integer searchTime; 

            private Builder() {
            } 

            private Builder(Head model) {
                this.docsFound = model.docsFound;
                this.docsReturn = model.docsReturn;
                this.searchTime = model.searchTime;
            } 

            /**
             * DocsFound.
             */
            public Builder docsFound(Integer docsFound) {
                this.docsFound = docsFound;
                return this;
            }

            /**
             * DocsReturn.
             */
            public Builder docsReturn(Integer docsReturn) {
                this.docsReturn = docsReturn;
                return this;
            }

            /**
             * SearchTime.
             */
            public Builder searchTime(Integer searchTime) {
                this.searchTime = searchTime;
                return this;
            }

            public Head build() {
                return new Head(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchImageByTextResponseBody} extends {@link TeaModel}
     *
     * <p>SearchImageByTextResponseBody</p>
     */
    public static class AllCategories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private AllCategories(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllCategories create() {
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

            private Builder() {
            } 

            private Builder(AllCategories model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public AllCategories build() {
                return new AllCategories(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchImageByTextResponseBody} extends {@link TeaModel}
     *
     * <p>SearchImageByTextResponseBody</p>
     */
    public static class PicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllCategories")
        private java.util.List<AllCategories> allCategories;

        private PicInfo(Builder builder) {
            this.allCategories = builder.allCategories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PicInfo create() {
            return builder().build();
        }

        /**
         * @return allCategories
         */
        public java.util.List<AllCategories> getAllCategories() {
            return this.allCategories;
        }

        public static final class Builder {
            private java.util.List<AllCategories> allCategories; 

            private Builder() {
            } 

            private Builder(PicInfo model) {
                this.allCategories = model.allCategories;
            } 

            /**
             * AllCategories.
             */
            public Builder allCategories(java.util.List<AllCategories> allCategories) {
                this.allCategories = allCategories;
                return this;
            }

            public PicInfo build() {
                return new PicInfo(this);
            } 

        } 

    }
}
