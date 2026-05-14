// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudListExtenResponseBody} extends {@link TeaModel}
 *
 * <p>CloudListExtenResponseBody</p>
 */
public class CloudListExtenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloudListExtenResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudListExtenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CloudListExtenResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloudListExtenResponseBody build() {
            return new CloudListExtenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudListExtenResponseBody} extends {@link TeaModel}
     *
     * <p>CloudListExtenResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Allow")
        private String allow;

        @com.aliyun.core.annotation.NameInMap("AreaCode")
        private String areaCode;

        @com.aliyun.core.annotation.NameInMap("CallPower")
        private String callPower;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Denoise")
        private Long denoise;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private String enterpriseId;

        @com.aliyun.core.annotation.NameInMap("Exten")
        private String exten;

        @com.aliyun.core.annotation.NameInMap("IbRecord")
        private Long ibRecord;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsDirect")
        private Long isDirect;

        @com.aliyun.core.annotation.NameInMap("IsOb")
        private Long isOb;

        @com.aliyun.core.annotation.NameInMap("JitterBuffer")
        private Long jitterBuffer;

        @com.aliyun.core.annotation.NameInMap("ObRecord")
        private Long obRecord;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Long type;

        private List(Builder builder) {
            this.allow = builder.allow;
            this.areaCode = builder.areaCode;
            this.callPower = builder.callPower;
            this.createTime = builder.createTime;
            this.denoise = builder.denoise;
            this.enterpriseId = builder.enterpriseId;
            this.exten = builder.exten;
            this.ibRecord = builder.ibRecord;
            this.id = builder.id;
            this.isDirect = builder.isDirect;
            this.isOb = builder.isOb;
            this.jitterBuffer = builder.jitterBuffer;
            this.obRecord = builder.obRecord;
            this.password = builder.password;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return allow
         */
        public String getAllow() {
            return this.allow;
        }

        /**
         * @return areaCode
         */
        public String getAreaCode() {
            return this.areaCode;
        }

        /**
         * @return callPower
         */
        public String getCallPower() {
            return this.callPower;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return denoise
         */
        public Long getDenoise() {
            return this.denoise;
        }

        /**
         * @return enterpriseId
         */
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return exten
         */
        public String getExten() {
            return this.exten;
        }

        /**
         * @return ibRecord
         */
        public Long getIbRecord() {
            return this.ibRecord;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isDirect
         */
        public Long getIsDirect() {
            return this.isDirect;
        }

        /**
         * @return isOb
         */
        public Long getIsOb() {
            return this.isOb;
        }

        /**
         * @return jitterBuffer
         */
        public Long getJitterBuffer() {
            return this.jitterBuffer;
        }

        /**
         * @return obRecord
         */
        public Long getObRecord() {
            return this.obRecord;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        public static final class Builder {
            private String allow; 
            private String areaCode; 
            private String callPower; 
            private String createTime; 
            private Long denoise; 
            private String enterpriseId; 
            private String exten; 
            private Long ibRecord; 
            private Long id; 
            private Long isDirect; 
            private Long isOb; 
            private Long jitterBuffer; 
            private Long obRecord; 
            private String password; 
            private Long type; 

            private Builder() {
            } 

            private Builder(List model) {
                this.allow = model.allow;
                this.areaCode = model.areaCode;
                this.callPower = model.callPower;
                this.createTime = model.createTime;
                this.denoise = model.denoise;
                this.enterpriseId = model.enterpriseId;
                this.exten = model.exten;
                this.ibRecord = model.ibRecord;
                this.id = model.id;
                this.isDirect = model.isDirect;
                this.isOb = model.isOb;
                this.jitterBuffer = model.jitterBuffer;
                this.obRecord = model.obRecord;
                this.password = model.password;
                this.type = model.type;
            } 

            /**
             * <p>允许的语音编码,支持格式: 1. g729 2. g729,alaw,ulaw 3. alaw,ulaw,g729 4. alaw,ulaw 5. myopus,alaw,ulaw 公网+远程话机支持配置1/2/3;专线+远程话机支持配置1/2;公网+软电话支持配置4;专线+软电话支持配置5;</p>
             * 
             * <strong>example:</strong>
             * <p>alaw,ulaw</p>
             */
            public Builder allow(String allow) {
                this.allow = allow;
                return this;
            }

            /**
             * <p>区号</p>
             * 
             * <strong>example:</strong>
             * <p>010</p>
             */
            public Builder areaCode(String areaCode) {
                this.areaCode = areaCode;
                return this;
            }

            /**
             * <p>呼叫权限，0：无限制，1：国内长途，2：国内本市，3：内部呼叫，默认无限制</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callPower(String callPower) {
                this.callPower = callPower;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-30 06:09:02</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>降噪开关 0:关闭 1:开启 默认关闭(该参数只有在类型为注册到webrtc才有效)</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder denoise(Long denoise) {
                this.denoise = denoise;
                return this;
            }

            /**
             * <p>企业编号</p>
             * 
             * <strong>example:</strong>
             * <p>7000002</p>
             */
            public Builder enterpriseId(String enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>分机号,3-11位</p>
             * 
             * <strong>example:</strong>
             * <p>66749</p>
             */
            public Builder exten(String exten) {
                this.exten = exten;
                return this;
            }

            /**
             * <p>呼入是否录音，0：不录用，1：录音，默认录音</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ibRecord(Long ibRecord) {
                this.ibRecord = ibRecord;
                return this;
            }

            /**
             * <p>分机号id</p>
             * 
             * <strong>example:</strong>
             * <p>59</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>是否允许摘机外呼，0：不允许，1：可以，默认允许</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isDirect(Long isDirect) {
                this.isDirect = isDirect;
                return this;
            }

            /**
             * <p>是否允许外呼，0：不允许，1：可以，默认允许</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isOb(Long isOb) {
                this.isOb = isOb;
                return this;
            }

            /**
             * <p>网络防抖</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder jitterBuffer(Long jitterBuffer) {
                this.jitterBuffer = jitterBuffer;
                return this;
            }

            /**
             * <p>外呼是否录音，0：不录音，1：录音，默认录音</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder obRecord(Long obRecord) {
                this.obRecord = obRecord;
                return this;
            }

            /**
             * <p>密码</p>
             * 
             * <strong>example:</strong>
             * <p>Aa626670</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>类型，1. 注册到IAD分机 2.注册到webrtc 3.注册到远程话机</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudListExtenResponseBody} extends {@link TeaModel}
     *
     * <p>CloudListExtenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndRow")
        private String endRow;

        @com.aliyun.core.annotation.NameInMap("FirstPage")
        private String firstPage;

        @com.aliyun.core.annotation.NameInMap("HasNextPage")
        private Long hasNextPage;

        @com.aliyun.core.annotation.NameInMap("HasPreviousPage")
        private Long hasPreviousPage;

        @com.aliyun.core.annotation.NameInMap("IsFirstPage")
        private Long isFirstPage;

        @com.aliyun.core.annotation.NameInMap("IsLastPage")
        private Long isLastPage;

        @com.aliyun.core.annotation.NameInMap("LastPage")
        private String lastPage;

        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("NavigatePages")
        private String navigatePages;

        @com.aliyun.core.annotation.NameInMap("NavigatepageNums")
        private java.util.List<String> navigatepageNums;

        @com.aliyun.core.annotation.NameInMap("NextPage")
        private String nextPage;

        @com.aliyun.core.annotation.NameInMap("OrderBy")
        private String orderBy;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private String pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("Pages")
        private String pages;

        @com.aliyun.core.annotation.NameInMap("PrePage")
        private String prePage;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("StartRow")
        private String startRow;

        @com.aliyun.core.annotation.NameInMap("Total")
        private String total;

        private Data(Builder builder) {
            this.endRow = builder.endRow;
            this.firstPage = builder.firstPage;
            this.hasNextPage = builder.hasNextPage;
            this.hasPreviousPage = builder.hasPreviousPage;
            this.isFirstPage = builder.isFirstPage;
            this.isLastPage = builder.isLastPage;
            this.lastPage = builder.lastPage;
            this.list = builder.list;
            this.navigatePages = builder.navigatePages;
            this.navigatepageNums = builder.navigatepageNums;
            this.nextPage = builder.nextPage;
            this.orderBy = builder.orderBy;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.pages = builder.pages;
            this.prePage = builder.prePage;
            this.size = builder.size;
            this.startRow = builder.startRow;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endRow
         */
        public String getEndRow() {
            return this.endRow;
        }

        /**
         * @return firstPage
         */
        public String getFirstPage() {
            return this.firstPage;
        }

        /**
         * @return hasNextPage
         */
        public Long getHasNextPage() {
            return this.hasNextPage;
        }

        /**
         * @return hasPreviousPage
         */
        public Long getHasPreviousPage() {
            return this.hasPreviousPage;
        }

        /**
         * @return isFirstPage
         */
        public Long getIsFirstPage() {
            return this.isFirstPage;
        }

        /**
         * @return isLastPage
         */
        public Long getIsLastPage() {
            return this.isLastPage;
        }

        /**
         * @return lastPage
         */
        public String getLastPage() {
            return this.lastPage;
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return navigatePages
         */
        public String getNavigatePages() {
            return this.navigatePages;
        }

        /**
         * @return navigatepageNums
         */
        public java.util.List<String> getNavigatepageNums() {
            return this.navigatepageNums;
        }

        /**
         * @return nextPage
         */
        public String getNextPage() {
            return this.nextPage;
        }

        /**
         * @return orderBy
         */
        public String getOrderBy() {
            return this.orderBy;
        }

        /**
         * @return pageNum
         */
        public String getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return pages
         */
        public String getPages() {
            return this.pages;
        }

        /**
         * @return prePage
         */
        public String getPrePage() {
            return this.prePage;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return startRow
         */
        public String getStartRow() {
            return this.startRow;
        }

        /**
         * @return total
         */
        public String getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String endRow; 
            private String firstPage; 
            private Long hasNextPage; 
            private Long hasPreviousPage; 
            private Long isFirstPage; 
            private Long isLastPage; 
            private String lastPage; 
            private java.util.List<List> list; 
            private String navigatePages; 
            private java.util.List<String> navigatepageNums; 
            private String nextPage; 
            private String orderBy; 
            private String pageNum; 
            private String pageSize; 
            private String pages; 
            private String prePage; 
            private String size; 
            private String startRow; 
            private String total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.endRow = model.endRow;
                this.firstPage = model.firstPage;
                this.hasNextPage = model.hasNextPage;
                this.hasPreviousPage = model.hasPreviousPage;
                this.isFirstPage = model.isFirstPage;
                this.isLastPage = model.isLastPage;
                this.lastPage = model.lastPage;
                this.list = model.list;
                this.navigatePages = model.navigatePages;
                this.navigatepageNums = model.navigatepageNums;
                this.nextPage = model.nextPage;
                this.orderBy = model.orderBy;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.pages = model.pages;
                this.prePage = model.prePage;
                this.size = model.size;
                this.startRow = model.startRow;
                this.total = model.total;
            } 

            /**
             * EndRow.
             */
            public Builder endRow(String endRow) {
                this.endRow = endRow;
                return this;
            }

            /**
             * FirstPage.
             */
            public Builder firstPage(String firstPage) {
                this.firstPage = firstPage;
                return this;
            }

            /**
             * HasNextPage.
             */
            public Builder hasNextPage(Long hasNextPage) {
                this.hasNextPage = hasNextPage;
                return this;
            }

            /**
             * HasPreviousPage.
             */
            public Builder hasPreviousPage(Long hasPreviousPage) {
                this.hasPreviousPage = hasPreviousPage;
                return this;
            }

            /**
             * IsFirstPage.
             */
            public Builder isFirstPage(Long isFirstPage) {
                this.isFirstPage = isFirstPage;
                return this;
            }

            /**
             * IsLastPage.
             */
            public Builder isLastPage(Long isLastPage) {
                this.isLastPage = isLastPage;
                return this;
            }

            /**
             * LastPage.
             */
            public Builder lastPage(String lastPage) {
                this.lastPage = lastPage;
                return this;
            }

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * NavigatePages.
             */
            public Builder navigatePages(String navigatePages) {
                this.navigatePages = navigatePages;
                return this;
            }

            /**
             * NavigatepageNums.
             */
            public Builder navigatepageNums(java.util.List<String> navigatepageNums) {
                this.navigatepageNums = navigatepageNums;
                return this;
            }

            /**
             * NextPage.
             */
            public Builder nextPage(String nextPage) {
                this.nextPage = nextPage;
                return this;
            }

            /**
             * OrderBy.
             */
            public Builder orderBy(String orderBy) {
                this.orderBy = orderBy;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(String pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Pages.
             */
            public Builder pages(String pages) {
                this.pages = pages;
                return this;
            }

            /**
             * PrePage.
             */
            public Builder prePage(String prePage) {
                this.prePage = prePage;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * StartRow.
             */
            public Builder startRow(String startRow) {
                this.startRow = startRow;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(String total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
