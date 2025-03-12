// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

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
 * {@link DetailSceneResponseBody} extends {@link TeaModel}
 *
 * <p>DetailSceneResponseBody</p>
 */
public class DetailSceneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Captures")
    private java.util.List<Captures> captures;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("CoverUrl")
    private String coverUrl;

    @com.aliyun.core.annotation.NameInMap("FloorPlans")
    private java.util.List<FloorPlans> floorPlans;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private Long gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private Long gmtModified;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("PreviewToken")
    private String previewToken;

    @com.aliyun.core.annotation.NameInMap("Published")
    private Boolean published;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceNum")
    private Long sourceNum;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StatusName")
    private String statusName;

    @com.aliyun.core.annotation.NameInMap("SubSceneNum")
    private Long subSceneNum;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DetailSceneResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.captures = builder.captures;
        this.code = builder.code;
        this.coverUrl = builder.coverUrl;
        this.floorPlans = builder.floorPlans;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.message = builder.message;
        this.name = builder.name;
        this.previewToken = builder.previewToken;
        this.published = builder.published;
        this.requestId = builder.requestId;
        this.sourceNum = builder.sourceNum;
        this.status = builder.status;
        this.statusName = builder.statusName;
        this.subSceneNum = builder.subSceneNum;
        this.success = builder.success;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetailSceneResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return captures
     */
    public java.util.List<Captures> getCaptures() {
        return this.captures;
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return coverUrl
     */
    public String getCoverUrl() {
        return this.coverUrl;
    }

    /**
     * @return floorPlans
     */
    public java.util.List<FloorPlans> getFloorPlans() {
        return this.floorPlans;
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
    public String getId() {
        return this.id;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return previewToken
     */
    public String getPreviewToken() {
        return this.previewToken;
    }

    /**
     * @return published
     */
    public Boolean getPublished() {
        return this.published;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceNum
     */
    public Long getSourceNum() {
        return this.sourceNum;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusName
     */
    public String getStatusName() {
        return this.statusName;
    }

    /**
     * @return subSceneNum
     */
    public Long getSubSceneNum() {
        return this.subSceneNum;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private java.util.List<Captures> captures; 
        private Long code; 
        private String coverUrl; 
        private java.util.List<FloorPlans> floorPlans; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private String id; 
        private String message; 
        private String name; 
        private String previewToken; 
        private Boolean published; 
        private String requestId; 
        private Long sourceNum; 
        private String status; 
        private String statusName; 
        private Long subSceneNum; 
        private Boolean success; 
        private String type; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Captures.
         */
        public Builder captures(java.util.List<Captures> captures) {
            this.captures = captures;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * CoverUrl.
         */
        public Builder coverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }

        /**
         * FloorPlans.
         */
        public Builder floorPlans(java.util.List<FloorPlans> floorPlans) {
            this.floorPlans = floorPlans;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * PreviewToken.
         */
        public Builder previewToken(String previewToken) {
            this.previewToken = previewToken;
            return this;
        }

        /**
         * Published.
         */
        public Builder published(Boolean published) {
            this.published = published;
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
         * SourceNum.
         */
        public Builder sourceNum(Long sourceNum) {
            this.sourceNum = sourceNum;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * StatusName.
         */
        public Builder statusName(String statusName) {
            this.statusName = statusName;
            return this;
        }

        /**
         * SubSceneNum.
         */
        public Builder subSceneNum(Long subSceneNum) {
            this.subSceneNum = subSceneNum;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DetailSceneResponseBody build() {
            return new DetailSceneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DetailSceneResponseBody} extends {@link TeaModel}
     *
     * <p>DetailSceneResponseBody</p>
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
     * {@link DetailSceneResponseBody} extends {@link TeaModel}
     *
     * <p>DetailSceneResponseBody</p>
     */
    public static class Captures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Captures(Builder builder) {
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Captures create() {
            return builder().build();
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String title; 
            private String url; 

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Captures build() {
                return new Captures(this);
            } 

        } 

    }
    /**
     * 
     * {@link DetailSceneResponseBody} extends {@link TeaModel}
     *
     * <p>DetailSceneResponseBody</p>
     */
    public static class FloorPlans extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColorMapUrl")
        private String colorMapUrl;

        @com.aliyun.core.annotation.NameInMap("FloorLabel")
        private String floorLabel;

        @com.aliyun.core.annotation.NameInMap("FloorName")
        private String floorName;

        @com.aliyun.core.annotation.NameInMap("MiniMapUrl")
        private String miniMapUrl;

        private FloorPlans(Builder builder) {
            this.colorMapUrl = builder.colorMapUrl;
            this.floorLabel = builder.floorLabel;
            this.floorName = builder.floorName;
            this.miniMapUrl = builder.miniMapUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FloorPlans create() {
            return builder().build();
        }

        /**
         * @return colorMapUrl
         */
        public String getColorMapUrl() {
            return this.colorMapUrl;
        }

        /**
         * @return floorLabel
         */
        public String getFloorLabel() {
            return this.floorLabel;
        }

        /**
         * @return floorName
         */
        public String getFloorName() {
            return this.floorName;
        }

        /**
         * @return miniMapUrl
         */
        public String getMiniMapUrl() {
            return this.miniMapUrl;
        }

        public static final class Builder {
            private String colorMapUrl; 
            private String floorLabel; 
            private String floorName; 
            private String miniMapUrl; 

            /**
             * ColorMapUrl.
             */
            public Builder colorMapUrl(String colorMapUrl) {
                this.colorMapUrl = colorMapUrl;
                return this;
            }

            /**
             * FloorLabel.
             */
            public Builder floorLabel(String floorLabel) {
                this.floorLabel = floorLabel;
                return this;
            }

            /**
             * FloorName.
             */
            public Builder floorName(String floorName) {
                this.floorName = floorName;
                return this;
            }

            /**
             * MiniMapUrl.
             */
            public Builder miniMapUrl(String miniMapUrl) {
                this.miniMapUrl = miniMapUrl;
                return this;
            }

            public FloorPlans build() {
                return new FloorPlans(this);
            } 

        } 

    }
}
