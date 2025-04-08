// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20201214;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.imagesearch20201214.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
     * <b>description</b> :
     * <p>This operation deletes images from an Image Search instance.</p>
     * <blockquote>
     * <p> A success response is returned even if the specified image does not exist on the instance. Therefore, you cannot determine whether the image exists on the instance based on the response.</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 20. In this case, the system can process at most 20 requests every second.</p>
     * 
     * @param request the request parameters of DeleteImage  DeleteImageRequest
     * @return DeleteImageResponse
     */
    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries instance details.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process only 1 request every second.</p>
     * 
     * @param request the request parameters of Detail  DetailRequest
     * @return DetailResponse
     */
    CompletableFuture<DetailResponse> detail(DetailRequest request);

    /**
     * <b>description</b> :
     * <p>This operation creates a task for exporting metadata from an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process at most 1 request every second.</p>
     * 
     * @param request the request parameters of DumpMeta  DumpMetaRequest
     * @return DumpMetaResponse
     */
    CompletableFuture<DumpMetaResponse> dumpMeta(DumpMetaRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries tasks that are used for exporting metadata from an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process at most 1 request every second.</p>
     * 
     * @param request the request parameters of DumpMetaList  DumpMetaListRequest
     * @return DumpMetaListResponse
     */
    CompletableFuture<DumpMetaListResponse> dumpMetaList(DumpMetaListRequest request);

    /**
     * <b>description</b> :
     * <p>This operation creates a batch task on an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process at most 1 request every second.</p>
     * 
     * @param request the request parameters of IncreaseInstance  IncreaseInstanceRequest
     * @return IncreaseInstanceResponse
     */
    CompletableFuture<IncreaseInstanceResponse> increaseInstance(IncreaseInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries batch tasks on an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process at most 1 request every second.</p>
     * 
     * @param request the request parameters of IncreaseList  IncreaseListRequest
     * @return IncreaseListResponse
     */
    CompletableFuture<IncreaseListResponse> increaseList(IncreaseListRequest request);

    /**
     * <b>description</b> :
     * <p>This operation searches for images by image name on an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>The maximum number of queries per second is displayed in the Image Search console. The upper limit is specified when you purchase the instance. You can set the upper limit to 5 QPS or 10 QPS.</p>
     * 
     * @param request the request parameters of SearchImageByName  SearchImageByNameRequest
     * @return SearchImageByNameResponse
     */
    CompletableFuture<SearchImageByNameResponse> searchImageByName(SearchImageByNameRequest request);

    /**
     * @param request the request parameters of SearchImageByText  SearchImageByTextRequest
     * @return SearchImageByTextResponse
     */
    CompletableFuture<SearchImageByTextResponse> searchImageByText(SearchImageByTextRequest request);

    /**
     * <b>description</b> :
     * <p>This operation updates image information on an Image Search instance.</p>
     * <blockquote>
     * <ul>
     * <li>Limits are imposed on the instance creation time.</li>
     * <li>This operation is supported by instances that are created in the Singapore (Singapore) region after December 2021. This operation is not supported in other regions.</li>
     * </ul>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 20. In this case, the system can process at most 20 requests every second.</p>
     * 
     * @param request the request parameters of UpdateImage  UpdateImageRequest
     * @return UpdateImageResponse
     */
    CompletableFuture<UpdateImageResponse> updateImage(UpdateImageRequest request);

}
